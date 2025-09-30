# 1. Build stage with Maven and JDK
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom.xml and download dependencies first (cache layer)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the whole source and build
COPY src ./src
RUN mvn clean package -DskipTests

# 2. Runtime stage with lightweight JDK
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Spring Boot default port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]

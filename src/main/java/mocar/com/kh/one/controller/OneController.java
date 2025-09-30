package mocar.com.kh.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class OneController {
//    ArrayList<Animal> list= new ArrayList<>();
//    List<Animal> list = new ArrayList<>();


    public OneController(){
//        list.add(new Animal("Dog", 1));
//        list.add(new Animal("Cat", 2));
    }
    @GetMapping("/string")
    public int num(){
        return 1;
    }
}

package study.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
     @GetMapping
    public  String welcome (){
         return "welcome to my first api with java";






    }
}

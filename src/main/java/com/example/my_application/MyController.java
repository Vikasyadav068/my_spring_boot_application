package com.example.my_application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class MyController {

   @RequestMapping("hello")
   
    public static String sayHello() {
        return "<h1>Hello, World!</h1>";

} 
}

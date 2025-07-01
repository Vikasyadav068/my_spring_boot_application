package com.example.my_application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

    @RequestMapping("hello")

    public static String sayHello() {
        return "<h1>Hello, World!</h1>";

    }

    @GetMapping("process-form")
    public static String processForm(
            @RequestParam int name1,
            @RequestParam int name2,
            @RequestParam String operation) {

        String result;

        switch (operation.toLowerCase()) {
            case "add":
                result = "Addition of " + name1 + " and " + name2 + " is: " + (name1 + name2);
                break;

            case "multiply":
                result = "Multiplication of " + name1 + " and " + name2 + " is: " + (name1 * name2);
                break;

            case "divide":
                if (name2 == 0) {
                    result = "Division by zero is not allowed!";
                } else {
                    result = "Division of " + name1 + " by " + name2 + " is: " + ((double) name1 / name2);
                }
                break;

            case "subtract":
                result = "Subtraction of " + name1 + " and " + name2 + " is: " + (name1 - name2);
                break;

            case "modulus":
                result = "Modulus of " + name1 + " and " + name2 + " is: " + (name1 % name2);
                break;

            case "percentage":
                if (name2 == 0) {
                    result = "Division by zero is not allowed!";
                } else {
                    result = "Percentage of " + name1 + " with respect to " + name2 + " is: " + ((double) name1 / name2 * 100) + "%";
                }
                break;

            default:
                result = "Invalid operation!";
                break;
        }

        return "<h1>" + result + "</h1>";
    }
}

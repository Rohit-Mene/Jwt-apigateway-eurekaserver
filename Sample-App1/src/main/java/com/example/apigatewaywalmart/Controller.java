package com.example.apigatewaywalmart;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Controller {

    @GetMapping("/hello")
    public String helloSend(){
        return "Hello";
    }
}

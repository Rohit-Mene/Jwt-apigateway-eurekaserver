package com.example.apigatewaywalmart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String helloSend(){
        return "Hello without cred";
    }

    @GetMapping("/get/{userName}")
    public UserModel getUser(@PathVariable("userName") String userName){
       return  userService.getUser(userName);
    }
}

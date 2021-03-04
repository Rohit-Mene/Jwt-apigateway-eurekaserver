package com.example.apigatewaywalmart;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/app")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hello")
    public ResponseEntity helloSend(){
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}

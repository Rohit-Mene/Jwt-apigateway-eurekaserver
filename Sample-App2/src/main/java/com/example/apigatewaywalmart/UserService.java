package com.example.apigatewaywalmart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;

@Service
public class UserService {
    @Autowired
    private Repository repository;


    public UserModel getUser(String username) {
        return repository.findById(username).get();
    }
}

package com.dailycodebuffer.jwt.service;

import com.dailycodebuffer.jwt.model.UserData;
//import com.dailycodebuffer.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        //Logic to get the user form the Database
       UserData user= restTemplate.getForObject("http://localhost:9001/app/get/"+userName,UserData.class);

       // UserData user = userRepository.findById(userName).get();

        return new User(user.getUsername(),user.getPassword(),new ArrayList<>());
    }
}

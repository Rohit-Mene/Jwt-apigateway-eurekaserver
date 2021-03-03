package com.example.apigatewaywalmart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @Id
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    //private String Image;
}

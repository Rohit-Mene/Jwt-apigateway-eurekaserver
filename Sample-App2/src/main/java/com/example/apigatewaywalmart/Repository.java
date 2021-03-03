package com.example.apigatewaywalmart;

import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<UserModel,String> {
}

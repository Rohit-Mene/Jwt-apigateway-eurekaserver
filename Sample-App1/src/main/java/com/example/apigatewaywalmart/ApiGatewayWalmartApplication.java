package com.example.apigatewaywalmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableEurekaClient

public class ApiGatewayWalmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayWalmartApplication.class, args);
	}

}

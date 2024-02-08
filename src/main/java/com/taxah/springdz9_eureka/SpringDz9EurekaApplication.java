package com.taxah.springdz9_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringDz9EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDz9EurekaApplication.class, args);
    }

}

package com.ocristian.plauser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PlaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaUserApplication.class, args);
    }
}

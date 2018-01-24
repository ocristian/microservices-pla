package com.ocristian.pladiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlaDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaDiscoveryApplication.class, args);
    }
}

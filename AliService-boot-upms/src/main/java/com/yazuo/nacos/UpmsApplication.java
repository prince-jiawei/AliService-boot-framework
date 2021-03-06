package com.yazuo.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmsApplication {


    public static void main(String[] args) {
        SpringApplication.run(UpmsApplication.class, args);
    }


}

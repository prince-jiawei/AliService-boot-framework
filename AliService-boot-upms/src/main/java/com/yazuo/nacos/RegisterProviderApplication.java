package com.yazuo.nacos;

import com.yazuo.nacos.config.PasswordProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class RegisterProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(RegisterProviderApplication.class, args);
    }


}

package com.yazuo.nacos.controller;

import com.yazuo.nacos.config.PasswordProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private  PasswordProperties passwordProperties;

    @GetMapping("/getProviderInfo")
    public String echo(String name) {
        return "provider:" + name + "password" + passwordProperties.getPassword();
    }

}
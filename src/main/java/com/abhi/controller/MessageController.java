package com.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello from Resource Server.!!!";
    }

}

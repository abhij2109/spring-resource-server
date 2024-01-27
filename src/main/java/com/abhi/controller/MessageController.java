package com.abhi.controller;

import com.abhi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping(value = "/hello")
    public String helloFirst(){
        return "Hello from first Resource Server!!!.";
    }

    @GetMapping(value = "/secondHello")
    public String helloSecond(){
        return "Hello from Resource Server in second way.!!!";
    }

    @GetMapping(value = "/thirdHello")
    public String helloThird(){
        return "Hello from Resource Server in Third way.";
    }

    @GetMapping(value = "/fourthHello")
    public String helloFourth() {
        return "Hello from Resource Server in Fourth way.";
    }

    @GetMapping(value = "/fifthHello")
    public String helloFifth() {
        return "Hello from Resource Server in Fifth way.";
    }

    @GetMapping(value = "/sixthHello")
    public String helloSixth() {
        return "Hello from Resource Server in Sixth way.";
    }

    @GetMapping(value = "/seventhHello")
    public String helloSeventh() {
        return "Hello from Resource Server in Seventh way.";
    }

    @GetMapping(value = "/EighthOneHello")
    public String helloEighthOne() {
        return "Hello from Resource Server in EighthOne way.";
    }

    @GetMapping(value = "/ninthHello")
    public String helloNinth() {
        return "Hello from Resource Server in ninth way.";
    }

}

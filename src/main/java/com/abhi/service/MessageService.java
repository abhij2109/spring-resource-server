package com.abhi.service;

import com.abhi.controller.MessageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageController messageController;

    public String firstControllerMethod(){
        return "Hello from first Resource Server and first service method call.";
    }

    public String secondControllerMethod(){
        return "Hello from Second Resource Server and second service method call.";
    }

    public String thirdControllerMethod(){
        return "Hello from third Resource Server and third service method call.";
    }

    public String fourthControllerMethod(){
        return "Hello from fourth Resource server and fourth service method call.";
    }

    public String fifthControllerMethod(){
        return "Hello from fifth Resource server and fifth service method call.";
    }
}


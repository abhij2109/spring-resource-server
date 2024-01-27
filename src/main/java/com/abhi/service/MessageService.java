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
}

package com.github.jaxrsplayground.controllers;

import com.github.jaxrsplayground.model.Message;
import com.github.jaxrsplayground.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MessageController {

    @Autowired
    private MessageService service;

    @RequestMapping(method = RequestMethod.GET, value = "/messages")
    public List<Message> getMessages() {
        return service.getMessages();
    }
}

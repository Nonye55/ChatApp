package com.springSecurity.securityProject.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {

    private List<String> messages;

    public MessageListService() {
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return new ArrayList<>(this.messages);
    }

    public void addMessage(String message) {
       messages.add(message);
    }
}

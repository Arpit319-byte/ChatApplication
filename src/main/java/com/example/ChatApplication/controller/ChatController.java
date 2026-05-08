package com.example.ChatApplication.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.example.ChatApplication.dto.SendMessageRequestDTO;
import com.example.ChatApplication.dto.SendMessageResponseDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ChatController {

    @MessageMapping("/message/send")
    public SendMessageResponseDTO sendMessage(SendMessageRequestDTO requestDTO){
        log.info("Recieved the message content: {} and sender: {}",requestDTO.getMessage(),requestDTO.getSender());
        return SendMessageResponseDTO.builder().message("Message received succesfully").build();
    }


    
}

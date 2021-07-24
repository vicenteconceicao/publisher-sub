package com.pubsub.publisher.controller;

import com.pubsub.publisher.dto.MessageDto;
import com.pubsub.publisher.service.GooglePublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private GooglePublisherService pubSubService;

    @PostMapping
    public ResponseEntity sendMessage(@RequestBody MessageDto message){
        try {
            pubSubService.publishMessage(message);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}

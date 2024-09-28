package com.ras.artemis.artemis_springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatcherService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jsm.queue}")
    private String jsmQueue;

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(jsmQueue,message);
    }
}

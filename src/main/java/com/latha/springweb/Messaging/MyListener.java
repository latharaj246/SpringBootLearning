package com.latha.springweb.Messaging;

import org.springframework.jms.annotation.JmsListener;

public class MyListener {
    @JmsListener(destination = "{sprindjms.myQueue}")
    public void receive(String message){
        System.out.println(message);
        
    }
}

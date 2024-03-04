package com.latha.springweb.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ParseException;

import org.springframework.batch.item.*;

import java.rmi.UnexpectedException;


public class Reader implements ItemReader<String> {
    private String[]  courses = {"Java Web Services", "i am doing", "wow 100% cpmpited"};
    private int count;
  @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
       if(count<courses.length) {
           return courses[count++];
       }else { count = 0;}
        return null;
    }
}

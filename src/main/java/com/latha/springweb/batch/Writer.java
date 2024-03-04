package com.latha.springweb.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {
//    @Override
//    public void Write(List<? extends String> item) throws Exception{
//        System.out.println("Inside Write");
//        System.out.println("Writing Done" + item);
//
//    }

    @Override
    public void write(Chunk<? extends String> item) throws Exception {
        System.out.println("Inside Write");
        System.out.println("Writing Done" + item);

    }
}

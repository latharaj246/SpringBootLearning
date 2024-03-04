package com.latha.springweb.batch;

import org.springframework.batch.item.ItemProcessor;

public class Prcessor  implements ItemProcessor<String,String> {

    @Override
    public String process(String item) throws Exception {
        System.out.println("Inside Process");
        return "PROCESSED" + item.toUpperCase();

    }
}

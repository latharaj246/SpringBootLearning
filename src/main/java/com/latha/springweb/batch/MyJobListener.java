package com.latha.springweb.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution){
        System.out.println("job started");

    }
    @Override
    public void afterJob(JobExecution jobExecution){
        System.out.println("job Ended" + jobExecution.getStatus().toString());

    }
}

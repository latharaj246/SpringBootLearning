package com.latha.springweb.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {

    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private PlatformTransactionManager transactionManager;

    @Bean
    public Job job(){
       return new JobBuilder("Job-1", jobRepository).start(step()).listener(listener()).build();



    }

    @Bean
    public Step step(){
        StepBuilder stepBuilder = new StepBuilder("step-1", jobRepository);
        return stepBuilder.<String, String>chunk(1,transactionManager).reader(reader()).processor(prcessor()).writer(writer()).build();
    }


    @Bean
    public Reader reader(){
        return new Reader();
    }
    @Bean
    public Writer writer(){
        return new Writer();
    }
    @Bean
    public Prcessor prcessor(){
        return new Prcessor();
    }
    @Bean
    public MyJobListener listener(){
        return new MyJobListener();
    }
}

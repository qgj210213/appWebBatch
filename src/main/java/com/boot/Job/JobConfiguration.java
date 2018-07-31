/*package com.boot.Job;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.support.ApplicationContextFactory;
import org.springframework.batch.core.configuration.support.GenericApplicationContextFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boot.config.JobOneConfiguration;
import com.boot.config.JobTwoConfiguration;

*//**
 * @author qiguangjie
 * 这个比较重要，把刚刚两个job类配置到这个类中，提供get方法返回，供后面ctx.getBean()来选择：
 *
 *//*
@Configuration
@EnableBatchProcessing(modular=true)
public class JobConfiguration {
    @Bean
    public ApplicationContextFactory oneJob(){
        return new GenericApplicationContextFactory(JobOneConfiguration.class);
    }

    @Bean
    public ApplicationContextFactory twoJob(){
        return new GenericApplicationContextFactory(JobTwoConfiguration.class);
    }

}
*/
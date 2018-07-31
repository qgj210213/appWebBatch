/*package com.boot.config;

import java.util.List;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

*//**
 * @author qiguangjie
 * spring batch写批处理程序时，往往会不止一个job的场景，并且需要根据实际需要来选择执行指定的job，
 * 比如：java -jar xxx.jar -参数，根据参数的不同来执行不同的job。
 * s下面以spring boot为基础的spring batch程序为例，讲述多个job时的相关配置。
 * s1、因为本文重点是介绍多个job时怎么选择性执行，先写两个job的简单配置：
 * s第一个Job的配置，根据需要也可配置多个step：
 *
 *//*
@Configuration

public class JobBatchConfigTwo {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    // Job
    @Bean
    public Job jobTwo() {
        return jobBuilderFactory.get("jobTwo")
                .incrementer(new RunIdIncrementer())
                .start(step1())
                .build();
    }

    @Bean
    public JdbcCursorItemReader<Map<String, String>> reader() {
        JdbcCursorItemReader<Map<String, String>> reader = new JdbcCursorItemReader<>();
        //reader逻辑根据实际需要写，先不举例
        return reader;
    }

    public ItemProcessor<Map<String, String>, String> tableProcessor() {
        return new ItemProcessor<Map<String, String>, String>() {
            @Override
            public String process(Map<String, String> map) throws Exception {
                String insertSql = "";
                //process逻辑根据实际需要写，先不举例
                return insertSql;
            }
        };
    }

    @Bean
    public ItemWriter<String> writer() {
        return new ItemWriter<String>() {
            @Override
            public void write(List<? extends String> list) throws Exception {
                //writer逻辑根据实际需要写，先不举例
            }
        };
    }

    //step
    @Bean
    @JobScope
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Map<String, String>, String> chunk(100)
                .reader(reader())
                .processor(tableProcessor())
                .writer(writer())
                .build();
    }

}
*/
package com.boot;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class AppWebBatch {

    public static void main(String[] args) {
        SpringApplication.run(AppWebBatch.class, args);
    }
    /*@Bean
    public JobRepository jobRepository(DataSource dataSource, PlatformTransactionManager transactionManager)
          throws Exception {
      JobRepositoryFactoryBean jobRepositoryFactoryBean = new JobRepositoryFactoryBean();
      jobRepositoryFactoryBean.setDataSource(dataSource);
      jobRepositoryFactoryBean.setTransactionManager(transactionManager);
      jobRepositoryFactoryBean.setDatabaseType("mysql");
      return jobRepositoryFactoryBean.getObject();
    }

    @Bean
    public SimpleJobLauncher jobLauncher(DataSource dataSource, PlatformTransactionManager transactionManager)
          throws Exception {
      SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
      jobLauncher.setJobRepository(jobRepository(dataSource, transactionManager));
      return jobLauncher;
    }*/
}

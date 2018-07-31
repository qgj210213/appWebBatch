package com.boot.controller;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiguangjie
 * 2.7 Controller
 * 控制器：配置web路由，访问/invokejob来调用任务
 *
 */
@RestController
public class JobInvokerController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job processJob;

    @Autowired
    ConfigurableApplicationContext ctx;

    @RequestMapping("/invokejob")
    public String handle() throws Exception {

        /*JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                .toJobParameters();
          jobLauncher.run(processJob, jobParameters);
                */
        // 时间参数设定
        JobParameters jobParameters = new JobParametersBuilder()
                .addDate("date", new Date())
                .toJobParameters();
        // 指定Job执行 JobBatchConfigOne
        jobLauncher.run(ctx.getBean("jobOne", Job.class), jobParameters);
        return "Batch job has been invoked jobOne";
    }
}

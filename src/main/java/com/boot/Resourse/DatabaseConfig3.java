/*package com.boot.Resourse;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

*//**
 * @author qiguangjie
 * 外部文件配置连接池
 * 第三种方式：使用Environment获取资源文件
 * ファイルDatabase.properties情報を取得
 *
 *//*

@Configuration
@PropertySource("classpath:config/Database.properties")
@Component

public class DatabaseConfig3 {
    @Autowired
    Environment environment;
    @Bean
    public DataSource getDataSource() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .url(environment.getProperty("spring.mysql.url"))
                .username(environment.getProperty("spring.mysql.username"))
                .password(environment.getProperty("spring.mysql.passwd"))
                .driverClassName(environment.getProperty("spring.mysql.driverClassName"))
                .build();
        return dataSource;
    }
}
*/
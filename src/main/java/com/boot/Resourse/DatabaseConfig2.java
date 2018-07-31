package com.boot.Resourse;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author qiguangjie
 * 外部文件配置连接池
 * 第一种方式：使用@ConfigurationProperties获取配置文件
 * 读取外部文件方式一
 * ファイルDatabase.properties情報を取得
 * 1.@Configuration
 * 2.@PropertySource("classpath:config/Database.properties")
 * 3.接頭語
 *
 */
@Configuration
@PropertySource("classpath:config/Database.properties")
@Component

public class DatabaseConfig2 {

    @Value("${spring.mysql.url}")
    private String url;
    @Value("${spring.mysql.username}")
    private String username;
    @Value("${spring.mysql.passwd}")
    private String passwd;
    @Value("${spring.mysql.driverClassName}")
    private String driverClassName;

    @Bean
    public DataSource getDataSource() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .url(url)
                .username(username)
                .password(passwd)
                .driverClassName(driverClassName)
                .build();
        return dataSource;
    }
}

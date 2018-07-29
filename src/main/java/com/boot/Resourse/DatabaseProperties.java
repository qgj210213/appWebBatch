/*package com.boot.Resourse;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

*//**
 * @author qiguangjie
 * ファイルDatabase.properties情報を取得
 * 1.@Configuration
 * 2.@PropertySource("classpath:config/Database.properties")
 * 3.接頭語
 *
 *//*
@Configuration
@PropertySource("classpath:config/Database.properties")
@ConfigurationProperties(prefix="spring.mysql",ignoreUnknownFields=false)
@Component
@Getter
@Setter
public class DatabaseProperties {
    private String url;
    private String username;
    private String passwd;
    private String driverClassName;

}
*/
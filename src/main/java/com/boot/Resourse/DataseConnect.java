/*package com.boot.Resourse;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "connect")
public class DataseConnect {
    @Autowired
    DatabaseProperties database;

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        DataSource dataSource = DataSourceBuilder
                .create()
                .url(database.getUrl())
                .username(database.getUrl())
                .password(database.getDriverClassName())
                .driverClassName(database.getDriverClassName())
                .build();
        return dataSource;
    }
        public static void main(String[] args) {
    DataseConnect dc = new DataseConnect();
    System.out.println(dc.getValue());
    }
    @RequestMapping(value="/value")
    public String  getValue() {
    return database.getUrl();
    }
}
*/
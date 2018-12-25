package com.maiev.demo.config;


import org.springframework.beans.factory.annotation.Value;

public class Db{
    @Value("${spring.jdbc.url}")
    private String url;

    @Value("${spring.jdbc.driver-class-name}")
    private String driver;

    @Value("${spring.jdbc.username}")
    private String username;

    @Value("${spring.jdbc.password}")
    private String password;
}

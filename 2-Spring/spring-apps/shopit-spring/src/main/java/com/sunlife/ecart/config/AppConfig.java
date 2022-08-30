package com.sunlife.ecart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan({"com.sunlife.ecart.service","com.sunlife.ecart.repository"})
@PropertySource(value="application.properties")
public class AppConfig {

    @Value("${name}")
    private String personName;

    @Autowired
    private Environment env;

    /*
    @Bean
    public void t1(){
        System.out.println("Name: "+env.getProperty("name"));
        System.out.println("Name:: "+personName);
    }


     */



}

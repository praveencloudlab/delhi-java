package com.sunlife.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sunlife.product.service","com.sunlife.product.dao"})
public class AppConfig {

    public AppConfig(){
        System.out.println(">>> AppConfig object created...");
    }



}

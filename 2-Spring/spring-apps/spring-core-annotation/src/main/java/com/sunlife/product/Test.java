package com.sunlife.product;

import com.sunlife.product.config.AppConfig;
import com.sunlife.product.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        System.out.println(">>>> main <<<<");

        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
       // ProductServiceImpl ps=ac.getBean("prodService", ProductServiceImpl.class);
        ProductServiceImpl ps=ac.getBean(ProductServiceImpl.class);

        ps.save();

    }
}

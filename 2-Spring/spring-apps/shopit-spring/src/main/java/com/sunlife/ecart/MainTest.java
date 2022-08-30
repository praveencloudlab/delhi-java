package com.sunlife.ecart;

import com.sunlife.ecart.config.AppConfig;
import com.sunlife.ecart.service.BillingServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

        BillingServiceImpl biller= ac.getBean(BillingServiceImpl.class);

        String[] cart={"P01","P02"};
        //biller.f1();

        double total=biller.cartTotal(cart);

        System.out.println("Cart Total Item Cost: "+total);


    }
}

package com.sunlife.ecart.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy(value = false)
@Scope(value = "singleton")
public class LifeCycleTest {

    public  LifeCycleTest(){
        System.out.println(">>> LifeCycleTest object created:: "+this.hashCode());
    }

    @Bean// new instance....
    public void m1(){
        System.out.println(">>> m1 method:: "+this.hashCode());
    }

    @PostConstruct
    public void m2(){
        System.out.println(">>> m2 method:: "+this.hashCode());
    }

    @PreDestroy
    public void m3(){
        System.out.println(">>> m3 method:: "+this.hashCode());
    }



}

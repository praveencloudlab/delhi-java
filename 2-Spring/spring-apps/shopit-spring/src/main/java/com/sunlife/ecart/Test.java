package com.sunlife.ecart;

import com.sunlife.ecart.config.AppConfig;
import com.sunlife.ecart.service.LifeCycleTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println(">>>> main <<<<<");
        AbstractApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        ac.getBean(LifeCycleTest.class);
         ac.close();
       // ac.clearResourceCaches();
       // ac.destroy();

       // ac.stop();
       // ac.registerShutdownHook();
    }
}

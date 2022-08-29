package com.sunlife.product.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// dependent
//@Component
@Service(value="prodService")
//@Repository
//@Controller
//@Configuration
@Scope("prototype")
@Lazy(value = true)
public class ProductServiceImpl {

    public ProductServiceImpl(){
        System.out.println(">>>>> ProductServiceImpl object created...");
    }

    // product related opertions ::: ONLY JAVA CODE

      public void save(){

          System.out.println(">>>>> ProductServiceImpl :: save method");
      }



}

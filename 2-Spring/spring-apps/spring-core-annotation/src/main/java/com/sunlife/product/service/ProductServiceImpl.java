package com.sunlife.product.service;

import com.sunlife.product.dao.ProductDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// dependent
//@Component
@Service
//@Repository
//@Controller
//@Configuration
//@Scope("prototype")
//@Lazy(value = true)
public class ProductServiceImpl {

    //private ProductDaoImpl productDao=new ProductDaoImpl();

   // @Autowired
    private ProductDaoImpl productDao;

    public void setProductDao(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    // constructor injection


    @Autowired
    public ProductServiceImpl(ProductDaoImpl productDao) {
        this.productDao = productDao;
    }

    public ProductServiceImpl(){
        System.out.println(">>>>> ProductServiceImpl object created...");

    }

    // product related opertions ::: ONLY JAVA CODE

      public void save(){
          System.out.println(">>>>> ProductServiceImpl :: save method");
          productDao.save();
      }



}

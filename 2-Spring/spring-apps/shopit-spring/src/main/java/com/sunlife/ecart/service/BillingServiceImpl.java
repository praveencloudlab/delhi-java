package com.sunlife.ecart.service;

import com.sunlife.ecart.repository.PriceMatrixDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl {

    private PriceMatrixDaoImpl priceDao;

    // setter based injection
    @Autowired
    public void setPriceDao(PriceMatrixDaoImpl priceDao) {
        System.out.println(">>>> setter injection:: "+priceDao.hashCode());
        this.priceDao = priceDao;
    }
    // constructor based injection

    @Autowired
    public BillingServiceImpl(PriceMatrixDaoImpl priceDao) {
        System.out.println(">>>> constructor injection:: "+priceDao.hashCode());
        this.priceDao = priceDao;
    }

    public double cartTotal(String[] cart){

        double total=0.0;

        for(String itemCode:cart){
            total=total+priceDao.getItemPrice(itemCode);
        }
        return total;
    }

}

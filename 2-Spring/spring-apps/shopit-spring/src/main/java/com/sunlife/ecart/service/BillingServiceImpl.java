package com.sunlife.ecart.service;

import com.sunlife.ecart.repository.OfferPriceMatrixDaoImpl;
import com.sunlife.ecart.repository.PriceMatrixDao;
import com.sunlife.ecart.repository.PriceMatrixDaoImpl;
import com.sunlife.ecart.repository.PriceMatrixDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl {
    @Autowired
   // @Qualifier("offerPriceMatrixDaoImpl")
    @Qualifier("priceMatrixDaoImpl")
    private PriceMatrixDao priceDao;
    // setter based injection

    /*
    @Autowired
    public void setPriceDao(PriceMatrixDao priceDao) {
        System.out.println(">>>> setter injection:: "+priceDao.hashCode());
        this.priceDao = priceDao;
    }

     */
    // constructor based injection



   /* public BillingServiceImpl(PriceMatrixDao priceDao) {
        System.out.println(">>>> constructor injection:: "+priceDao.hashCode());
        this.priceDao = priceDao;
    }
    */


    @Bean
    public void f1(){
        System.out.println(">>> BillingServiceImpl:: f1 method ");
    }

    @Bean
    public void f2(){
        System.out.println(">>> BillingServiceImpl:: f2 method ");
    }

    public double cartTotal(String[] cart){

        double total=0.0;

        for(String itemCode:cart){
            total=total+priceDao.getItemPrice(itemCode);
        }
        return total;
    }

}

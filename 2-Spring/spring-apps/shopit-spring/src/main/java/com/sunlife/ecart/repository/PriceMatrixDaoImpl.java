package com.sunlife.ecart.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixDaoImpl {

    public PriceMatrixDaoImpl() {
        System.out.println(">>> PriceMatrixDaoImpl:: "+this.hashCode());
    }

    public double getItemPrice(String itemCode){
        //  DB code
        return 100.00;
    }
}

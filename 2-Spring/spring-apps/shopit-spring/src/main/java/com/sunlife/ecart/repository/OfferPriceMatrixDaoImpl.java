package com.sunlife.ecart.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OfferPriceMatrixDaoImpl implements  PriceMatrixDao{


    @Override
    public double getItemPrice(String itemCode) {

        return 50;
    }
}

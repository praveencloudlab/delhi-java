package com.sunlife.ecart.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy(value = true)
public class OfferPriceMatrixDaoImpl implements  PriceMatrixDao{


    @Override
    public double getItemPrice(String itemCode) {

        return 50;
    }
}

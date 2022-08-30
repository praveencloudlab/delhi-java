package com.sunlife.ecart.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy(value = true)

public class PriceMatrixDaoImpl implements PriceMatrixDao {

    public PriceMatrixDaoImpl() {
        System.out.println(">>> PriceMatrixDaoImpl:: "+this.hashCode());
    }

    @Override
    public double getItemPrice(String itemCode){
        //  DB code
        return 100.00;
    }
}

package com.how2java.tmall.Comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

public class ProductDateComparator implements Comparator <Product>{
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getCreateDate().compareTo(product2.getCreateDate());
    }
}

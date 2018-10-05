package com.example.thymeleafdemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {


    public List<Product> findAll(){

        return Arrays.asList(new Product(1L,"商品1",8500,0.9f),
                new Product(2L,"商品2",10050,1.0f),
                new Product(3L,"商品3",3080,0.85f));
    }

}

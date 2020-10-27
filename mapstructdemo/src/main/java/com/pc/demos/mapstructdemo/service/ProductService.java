package com.pc.demos.mapstructdemo.service;

import com.pc.demos.mapstructdemo.domain.Product;
import com.pc.demos.mapstructdemo.mapper.ProductMapper;
import com.pc.demos.mapstructdemo.models.ProductRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper){
        this.productMapper = productMapper;
    }

    public Product createProduct(ProductRequest productRequest){

        return productMapper.productRequestToProduct(productRequest);
    }

}

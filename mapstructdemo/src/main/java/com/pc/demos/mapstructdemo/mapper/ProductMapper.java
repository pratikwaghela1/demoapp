package com.pc.demos.mapstructdemo.mapper;

import com.pc.demos.mapstructdemo.domain.Product;
import com.pc.demos.mapstructdemo.models.ProductRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productRequestToProduct(ProductRequest productRequest);
}

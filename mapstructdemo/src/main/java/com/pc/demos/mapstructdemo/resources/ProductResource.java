package com.pc.demos.mapstructdemo.resources;

import com.pc.demos.mapstructdemo.domain.Product;
import com.pc.demos.mapstructdemo.models.ProductRequest;
import com.pc.demos.mapstructdemo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request){
        System.out.println("Create Product method request received "+request);
        return new ResponseEntity<>(productService.createProduct(request),HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Integer> getProduct(@PathVariable("id") int id){
        System.out.println("Get Product method call");
        return  new ResponseEntity<Integer>(id, HttpStatus.OK);
    }


}

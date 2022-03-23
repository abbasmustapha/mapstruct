package com.example.mapstruct.springmapstructdemo.controller;

import com.example.mapstruct.springmapstructdemo.dto.ProductDto;
import com.example.mapstruct.springmapstructdemo.mapper.ProductMapper;
import com.example.mapstruct.springmapstructdemo.model.Product;
import com.example.mapstruct.springmapstructdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto) {
        return new ResponseEntity<>(productRepository.save(
                productMapper.dtoToModel(productDto)), HttpStatus.CREATED);
    }

    public ResponseEntity<List<ProductDto>> findAll(){
        return new ResponseEntity<List<ProductDto>>(productMapper.modelToDtos(productRepository.findAll()),HttpStatus.OK);

    }

}

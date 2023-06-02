package com.example.damcuoi.service.impl;

import com.example.damcuoi.entity.Product;
import com.example.damcuoi.repository.IProductRepository;
import com.example.damcuoi.request.ProductRequest;
import com.example.damcuoi.response.ProductResponse;
import com.example.damcuoi.service.IProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createProduct(ProductRequest request) {
        Product product = new Product(request);
        productRepository.save(product);
    }

    @Override
    public List<ProductResponse> getProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> responses = modelMapper.map(products, new TypeToken<List<ProductResponse>>() {
        }.getType());

        return responses;
    }


}

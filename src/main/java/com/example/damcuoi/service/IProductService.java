package com.example.damcuoi.service;

import com.example.damcuoi.request.ProductRequest;
import com.example.damcuoi.response.ProductResponse;

import java.util.List;

public interface IProductService {

    void createProduct(ProductRequest request);

    List<ProductResponse> getProducts();
}

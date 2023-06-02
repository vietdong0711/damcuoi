package com.example.damcuoi.service;

import com.example.damcuoi.request.CustomerRequest;
import com.example.damcuoi.response.CustomerResponse;

import java.util.List;

public interface ICustomerService {
    void createCustomer(CustomerRequest request);

    List<CustomerResponse> getCustomers();
}

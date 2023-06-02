package com.example.damcuoi.service.impl;

import com.example.damcuoi.entity.Customer;
import com.example.damcuoi.repository.ICustomerRepository;
import com.example.damcuoi.request.CustomerRequest;
import com.example.damcuoi.response.CustomerResponse;
import com.example.damcuoi.service.ICustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createCustomer(CustomerRequest request) {
        Customer customer = new Customer(request);
        customerRepository.save(customer);
    }

    @Override
    public List<CustomerResponse> getCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponse> responses = modelMapper.map(customers, new TypeToken<List<CustomerResponse>>() {
        }.getType());
        return responses;
    }
}

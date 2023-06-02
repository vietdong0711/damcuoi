package com.example.damcuoi.service.impl;

import com.example.damcuoi.entity.Customer;
import com.example.damcuoi.entity.Gift;
import com.example.damcuoi.entity.Menu;
import com.example.damcuoi.entity.Product;
import com.example.damcuoi.repository.ICustomerRepository;
import com.example.damcuoi.repository.IGiftRepository;
import com.example.damcuoi.repository.IMenuRepository;
import com.example.damcuoi.repository.IProductRepository;
import com.example.damcuoi.response.TotalResponse;
import com.example.damcuoi.service.ITotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotalServiceImpl implements ITotalService {

    @Autowired
    private IGiftRepository giftRepository;

    @Autowired
    private IMenuRepository menuRepository;

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public TotalResponse getTotal() {
        List<Product> products = productRepository.findAll();
        double totalProduct = 0;
        for (Product product : products) {
            totalProduct += product.getPrice() * product.getQuantity();
        }

        List<Menu> menus = menuRepository.findAll();
        double totalMenu = 0;
        for (Menu menu : menus) {
            totalMenu += menu.getPrice();
        }
        totalMenu *= 100;

        List<Gift> gifts = giftRepository.findAll();
        double totalGift = 0;
        for (Gift gift : gifts) {
            totalGift += gift.getPrice();
        }


        return new TotalResponse(totalProduct, totalMenu, totalGift);
    }
}

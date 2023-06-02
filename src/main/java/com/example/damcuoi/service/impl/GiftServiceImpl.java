package com.example.damcuoi.service.impl;

import com.example.damcuoi.entity.Customer;
import com.example.damcuoi.entity.Gift;
import com.example.damcuoi.repository.ICustomerRepository;
import com.example.damcuoi.repository.IGiftRepository;
import com.example.damcuoi.request.GiftRequest;
import com.example.damcuoi.response.GiftResponse;
import com.example.damcuoi.service.IGiftService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiftServiceImpl implements IGiftService {

    @Autowired
    private IGiftRepository giftRepository;
    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createGift(GiftRequest request) throws Exception {
        Optional<Customer> optionalCustomer = customerRepository.findById(request.getCustomerId());
        if (!optionalCustomer.isPresent()) {
            throw new Exception("Khach moi nay ko ton tai");
        }
        Gift gift = new Gift(request);
        gift.setCustomer(optionalCustomer.get());
        giftRepository.save(gift);
    }

    @Override
    public List<GiftResponse> getGifts() {
        List<Gift> gifts = giftRepository.findAll();
        List<GiftResponse> responses = modelMapper.map(gifts, new TypeToken<List<GiftResponse>>() {
        }.getType());

        return responses;
    }
}

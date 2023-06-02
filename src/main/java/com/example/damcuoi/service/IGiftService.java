package com.example.damcuoi.service;

import com.example.damcuoi.request.GiftRequest;
import com.example.damcuoi.response.GiftResponse;

import java.util.List;

public interface IGiftService {
    void createGift(GiftRequest request) throws Exception;

    List<GiftResponse> getGifts();
}

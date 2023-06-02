package com.example.damcuoi.request;

import lombok.Data;

@Data
public class GiftRequest {
    private Long id;

    private Long customerId;

    private double price;
}

package com.example.damcuoi.request;

import lombok.Data;

@Data
public class CustomerRequest {
    private Long id;

    private String name;

    private String phone;

    private String address;
}

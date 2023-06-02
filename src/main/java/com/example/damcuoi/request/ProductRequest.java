package com.example.damcuoi.request;

import com.example.damcuoi.entity.Type;
import lombok.Data;

@Data
public class ProductRequest {

    private Long id;

    private String name;

    private double price;

    private int quantity;

    private String unit;

    private String type;
}

package com.example.damcuoi.entity;

import com.example.damcuoi.request.ProductRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private double price;

    private int quantity;

    private String unit;

    private Type type;

    public Product(ProductRequest request){
        this.id = request.getId();;
        this.name = request.getName();
        this.price = request.getPrice();
        this.type = Type.valueOf(request.getType());
        this.unit = request.getUnit();
        this.quantity = request.getQuantity();
    }
}

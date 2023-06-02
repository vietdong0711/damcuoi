package com.example.damcuoi.entity;

import com.example.damcuoi.request.CustomerRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String phone;

    private String address;

    public Customer(CustomerRequest request){
        this.id = request.getId();
        this.name = request.getName();
        this.address = request.getAddress();
        this.phone = request.getPhone();
    }
}

package com.example.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_item")
@Entity
public class OrderItem {
    @Id
    private long id;
    private String skuCode;
    private BigDecimal price;
    private int quantity;
}

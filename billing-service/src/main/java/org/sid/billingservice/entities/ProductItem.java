package org.sid.billingservice.entities;

import jakarta.persistence.*;
import org.sid.billingservice.model.Product;

@Entity

public class ProductItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private double price;
    private int quantity;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;


}

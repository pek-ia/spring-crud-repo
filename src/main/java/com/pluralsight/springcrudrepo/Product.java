package com.pluralsight.springcrudrepo;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Table("products")
public class Product {

    @Id @Column("ProductId")
    int productId;

    @Column("ProductName")
    String name;

    @Column("UnitPrice")
    double unitPrice;

    public Product(int productId, String name, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }
}

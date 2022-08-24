package com.example.groupproject.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Product {

    @Id
     private int productId;
        private String category;

        private String ProductName;

        private int price;

        private int stocks;

        private Date createdAt;

        private Date updatedAt;
        @OneToOne
        private User merchantId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(User merchantId) {
        this.merchantId = merchantId;
    }
}

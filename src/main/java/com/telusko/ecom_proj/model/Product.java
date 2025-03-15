package com.telusko.ecom_proj.model;


import jakarta.persistence.*;


import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desk;
    private String brand;
    private int price;
    private String category;
    private Date realeseDate;
    private boolean available;
    private int quantity;

    public Product() {
    }

    public Product(String name, String desk, String brand, int price, String category, Date realeseDate, boolean available, int quantity) {
        this.name = name;
        this.desk = desk;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.realeseDate = realeseDate;
        this.available = available;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getRealeseDate() {
        return realeseDate;
    }

    public void setRealeseDate(Date realeseDate) {
        this.realeseDate = realeseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desk='" + desk + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", realeseDate=" + realeseDate +
                ", available=" + available +
                ", quantity=" + quantity +
                '}';
    }
}

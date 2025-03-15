package com.telusko.ecom_proj.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    private int id;
    private String name;
    private String desk;
    private String brand;
    private int price;
    private String category;
    private Date realeseDate;
    private boolean available;
    private int quantity;

}

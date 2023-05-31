package com.mycompany.app.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
  private String product_id;
  private String name;
  private String description;
  private double price;
  private double rating;
  private int quantity;
  private String category;

  public Product(Product prod) {
    this.product_id = prod.getProduct_id();
    this.name = prod.getName();
    this.description = prod.getDescription();
    this.category = prod.getCategory();
  }
}

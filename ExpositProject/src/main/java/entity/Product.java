package entity;

import entity.Category;

import java.awt.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;


public class Product {
    String productName;
    int price;
    List <Category> prodCategory;



    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public List <Category> getProdCategory() { return prodCategory; }
    public void setProdCategory(List <Category> prodCategory) { this.prodCategory = prodCategory; }


    public Product(String productName, int price,List <Category> categories) {
        this.productName = productName;
        this.price = price;
        List <Category> prodCategory = categories;
    }
}

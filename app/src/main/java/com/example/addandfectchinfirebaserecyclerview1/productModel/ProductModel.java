package com.example.addandfectchinfirebaserecyclerview1.productModel;

public class ProductModel {
    private int id;
    private String name;
    private String category;
    private int price;

    public ProductModel(int id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

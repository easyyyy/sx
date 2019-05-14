package com.shopping;

public class Product {
    private int Id;
    private String name;
    private double price;
    private String detail;
    private int num;
    private String category;

    public Product(int id, String name, double price, String detail, int num, String category) {
        Id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.num = num;
        this.category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", num=" + num +
                ", category='" + category + '\'' +
                '}';
    }
}

package models;

public abstract class Products {
    private double price;
    private String color;
    private String brand;

    public Products(double price, String color, String brand){
        this.price=price;
        this.color=color;
        this.brand=brand;
    }

    //parent copy CC
    public Products(Products source){
        this.price=source.price;
        this.color=source.color;
        this.brand=source.brand;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void fold();

}

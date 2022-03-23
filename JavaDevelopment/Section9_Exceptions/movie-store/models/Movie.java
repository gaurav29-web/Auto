package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean IsAvailable;

    public Movie(String name, String format, double rating){
        if(name.isBlank() || name==null){
            throw new IllegalArgumentException("Name should not be null");
        }

        if(format.isBlank() || format==null){
            throw new IllegalArgumentException("Invalid format");
        }

        if(rating<0 || rating >10){
            throw new IllegalArgumentException("Invalid rating");
        }
        this.name=name;
        this.format=format;
        this.rating=rating;
        this.sellingPrice=format.equals("Blue-Ray") ? 4.25:2.95;
        this.rentalPrice=format.equals("Blue-Ray") ? 1.99 : 0.99;
        this.IsAvailable=true;
    }

    public Movie(Movie source){
        this.name=source.name;
        this.format=source.format;
        this.rating=source.rating;
        this.sellingPrice=source.sellingPrice;
        this.rentalPrice=source.rentalPrice;
        this.IsAvailable=source.IsAvailable;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
    //Getter fr boolean field is written as below and not using get keyword
    public boolean isIsAvailable() {
        return IsAvailable;
    }

    public void setName(String name) {
        if(name.isBlank() || name==null){
            throw new IllegalArgumentException("Invalid Name");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        this.format = format;
        setSellingPrice(this.sellingPrice=format.equals("Blue-Ray") ? 4.25:2.95);
        setRentalPrice(rentalPrice=format.equals("Blue-Ray") ? 1.99 : 0.99);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    //so that not changed from outside instead per condition
    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setIsAvailable(boolean isAvailable) {
        IsAvailable = isAvailable;
    }

    public String toString(){
        return "\t Name: " + this.name + "\n" +
"\t Format: " +this.format + "\n" +
"\t Rating: " + this.rating + "\n" +
"\t Selling Price: " + this.sellingPrice + "\n" +
"\t Rental Price: " + this.rentalPrice + "\n" +
"\t Availability: " + (this.IsAvailable ? "In stock" : "rented")+ "\n";
    }
}

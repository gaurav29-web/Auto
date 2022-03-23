package models;

import java.util.Objects;

public class Shirt extends Products{
    public enum Size {
        SMALL,MEDIUM,LARGE
    }
    private Size size;//size is of type enum
    public Shirt(Size size,double price, String color, String brand){
        super(price,color,brand);
        this.size =size;
    }

    //create copy constrctour in child and then in paret needed
    public Shirt(Shirt source){
        super(source);
        this.size =size;
    }


    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + super.getBrand() + "'" +
            "}";
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return size.equals(this.size) && super.getPrice() == shirt.getPrice()
        && super.getColor().equals(shirt.getColor()) && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public void fold(){
        System.out.println("Lay down shirt");
        System.out.println("bring sleeves in");
        System.out.println("fold complete shirt");
    }

}

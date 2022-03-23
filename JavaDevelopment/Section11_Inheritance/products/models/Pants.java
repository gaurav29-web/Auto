package models;

import java.util.Objects;

public class Pants extends Products implements Discount, Comparable<Pants>{
    private int waist;

    public Pants(int waist,double price, String color, String brand){
        super(price,color,brand);
        this.waist=waist;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void discount(){
        super.setPrice(super.getPrice()/2);
    }

    @Override
    public String toString() {
        return "{" +
            " waist='" + getWaist() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + super.getBrand() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist
            && super.getPrice()== pants.getPrice()
            && super.getBrand().equals(pants.getBrand())
            && super.getColor().equals(pants.getColor())        ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(),super.getColor(), super.getBrand());
    }

    @Override
    public void fold(){
        System.out.println("Fold half pant");
        System.out.println("Fold it completly");
    }

    @Override
    public int compareTo(Pants specifiedObject){
        return (int) Math.round(super.getPrice()-specifiedObject.getPrice());
    }
    
}

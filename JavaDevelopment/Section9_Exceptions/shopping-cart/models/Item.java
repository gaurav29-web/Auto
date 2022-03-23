package models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price){
        if(name.isBlank() || name==null){
            throw new IllegalArgumentException("Name can not be null");
        }

        if(price<0 ) throw new IllegalArgumentException("Price can not be negative");
        this.name=name;
        this.price=price;
    }

    public Item(Item source){
        this.name=source.name;
        this.price=source.price;
    }

    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
  
    public void setName(String name) {
        if(name.isBlank() || name==null){
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if(price<0 ) throw new IllegalArgumentException("Price can not be negative");
        this.price = price;
    }

    public String toString(){
        return "name "+ this.name + ". price is : $"+this.price;
    }

    public boolean equals(Object o){
        if(o ==null){
            return false;
        }
        if(!(o instanceof Item)){
            return false;
        }
        Item item = (Item)o;
        return this.name.equals(item.name)&& this.price==item.price;
    }
}

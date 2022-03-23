package models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items ;
    public Cart(){
        items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item){
        this.items.set(index, item);
    }




   /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */

public boolean add(Item item){
    if(this.items.contains(item)){ //added equals method to give this method more power
        return false;
    }
    else{
        this.items.add(item);
        return true;
    }
}

 
 
  
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
public void remove(String name){
    if(items.isEmpty()){
        throw new IllegalStateException("Can not remove item from blank list");
    }
    for (int i = 0; i < this.items.size(); i++) {
        if(this.items.get(i).getName().equals(name));
        this.items.remove(i);
    }
}
 
 
  
   /**
    *  Name: checkout
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    public String checkout(){
        if(items.isEmpty()){
            throw new IllegalStateException("Can not checkout blank list");
        }
        double[] measures = new double[3];
        for (int i = 0; i < this.items.size(); i++) {
            measures[0] +=this.items.get(i).getPrice();
        }
        measures[1] = measures[0] * 0.13;

        measures[2] = measures[0]+measures[1];

        return "RECEIPT total is : "+ measures[2];
    }

    public String toString(){
        String temp ="";
            for (int i = 0; i < items.size(); i++) {
                temp+=items.get(i).getName();
            }
        return temp;
    }
    
}

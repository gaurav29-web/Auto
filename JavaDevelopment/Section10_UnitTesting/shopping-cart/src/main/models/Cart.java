package src.main.models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }

public boolean add(Item item){
    if(this.items.contains(item)) return false;
    else{
        this.items.add(new Item(item));
        return true;
    }
}

public void remove(String item){
    for (int i = 0; i < this.items.size(); i++) {
        if(this.items.get(i).getName().equals(item)){
            this.items.remove(i);
        }
    }
}

public boolean contains(Item item){
    return this.items.contains(item);
}

    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}

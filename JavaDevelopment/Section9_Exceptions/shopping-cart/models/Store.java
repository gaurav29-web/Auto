package models;

public class Store {
    private Item[][] items;

    public Store(){
        items = new Item[7][3];
    }

    public Item getItem(int row, int col){
        return new Item(this.items[row][col]);
    }

    public void setItem(int row, int col, Item item){
        this.items[row][col]= new Item(item);
    }

    public String toString(){
        String temp="";
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                temp+=this.items[i][j].toString();
            }
        }
        return temp;
    }
}

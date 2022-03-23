public class Main {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("Welcome to Java Drinks!!");
        System.out.println("*********************************");
        Item[][] items = new Item[][]
        {
            {new Item("Pepsi",11.2,2),new Item("Coffee", 22.0,3), new Item("Soda",1.1,1)},
            {new Item("Coke",11.0,1),new Item("Latte Coffee", 22.1,2), new Item("Lime",1.2,10)},
            {new Item("Sprit",12.0,1),new Item("Shake", 22.2,4), new Item("Water",1.3,2)},
        };
     

        Machine machine = new Machine(items);
        
        Item item = machine.getItem(2, 1);
        item.setPrice(32);
        machine.setItem(item, 2, 1);
        System.out.println(machine.getItem(2, 1));

        //Test dispense
        machine.dispense(2,1);
        machine.dispense(2,1);
        System.out.println(machine.getItem(2, 1));//check the quantity left

         //Print values from toString method
         System.out.println(machine);
    }
}
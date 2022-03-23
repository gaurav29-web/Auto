import models.Pants;
import models.Shirt;
public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt = new Shirt(Shirt.Size.SMALL,3.33,"blue","Java");

        //Copy constructor used since using obj1
        Shirt shirt2 = new Shirt(shirt);

        Pants pant = new Pants(1, 1.1, "blue", "lava");

        Pants pant2 = new Pants(1, 2.1, "blue", "lava");

        System.out.println(pant2.compareTo(pant));

        shirt.getPrice();
        shirt.fold();
        pant.fold();

        pant.getPrice();
        pant.discount();
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}

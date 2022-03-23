package src.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;
import src.main.models.Item;
import src.main.models.Cart;

public class CartTest {

    Cart cart;
    
    @Before
    public void setUp(){
        cart = new Cart();
        cart.add(new Item("Pepsi", 199));
        cart.add(new Item("Coke", 199));
    }

    @Test
    public void itemAddedTest(){
        assertTrue(cart.contains(new Item("Pepsi", 199)));
    }

    @Test
    public void skipDuplicate(){
        assertFalse(cart.add(new Item("Pepsi", 199)));
    }

    @Test
    public void removeItemTest(){
        cart.remove("Coke");
        assertFalse(cart.contains(new Item("Coke", 199)));
    }
}

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Main;

public class checkoutTest {
    
    @Test
    public void subTotalIsValid(){
        assertEquals(19.2, Main.getSubTotal());
    }

    @Test 
    public void taxIsValid(){
        assertEquals(3.9, Main.getTax(30));
    }

    @Test
    public void totalIsValid(){
        assertEquals(113, Main.getTotal(100,13));
    }
}

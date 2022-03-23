package src.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;
import src.main.models.Store;
import src.main.models.Movie;

public class StoreTest {

    Store store;

    @Before
    public void setUp(){
        store = new Store();
        store.addMovie(new Movie("The Shaw Shank", "Blue-Ray",9.2));
        store.addMovie(new Movie("Movie 2", "Blue-Ray",9.2));
        store.addMovie(new Movie("God father", "Blue-Ray",9.2));
    }

    @Test
    public void testMovieAdded(){
        assertTrue(store.contains(new Movie("Movie 2", "Blue-Ray",9.2)));
    }

    @Test
    public void testSellMovie(){
        store.sellMovie("Movie 2");
        assertFalse(store.contains(new Movie("Movie 2", "Blue-Ray",9.2)));
    }

    @Test
    public void rentMovieTest(){
        store.rentMovie("God father");
        assertFalse(store.getMovie(2).isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void movieNotInStock(){
        store.rentMovie("The Shaw Shank");
        store.sellMovie("The Shaw Shank");
    }
}

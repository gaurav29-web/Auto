package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import src.main.models.Team;

public class TeamTest {
    @Test
    public void hasNullTest(){
        String[] chasers = new String[] {null,"Ginny","Max"};
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest(){
        String[] chasers = new String[] {" ","Ginny","Joe"};
        assertTrue(Team.hasBlank(chasers));
    }

}

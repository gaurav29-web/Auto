package src.main.models;

import java.util.Arrays;
import java.util.Objects;

import org.hamcrest.core.IsInstanceOf;

public class Team {
    private String house;
    private String keeper;
    private String seeker;
    private String[] chasers;

    private static final String POSITION_CHASER = "chaser";
    private static final String POSITION_SEEKER = "seeker";
    private static final String POSITION_KEEPER = "keeper";

    public Team(String house, String keeper, String seeker, String[] chasers){
        if(house==null || keeper==null || seeker==null){
            throw new IllegalArgumentException("Can not be null");
        }

        if(house.isBlank() || keeper.isBlank() || seeker.isBlank()){
            throw new IllegalArgumentException("Can not be blank");
        }

        if(chasers.length !=3){
            throw new IllegalArgumentException("Must have three chasers");
        }

        if(hasNull(chasers) || hasBlank(chasers)){
            throw new IllegalArgumentException("Chaers can not be blank or null");
        }
        this.house=house;
        this.keeper=keeper;
        this.seeker=seeker;
        this.chasers= Arrays.copyOf(chasers, chasers.length);
    }

    public static boolean hasNull(String[] array){
        return Arrays.stream(array).anyMatch((element) -> element ==null);
    }

    public static boolean hasBlank(String[] array){
        return Arrays.stream(array).anyMatch((element) -> element.isBlank());
    }

    public Team(Team source){
        this.house=source.house;
        this.keeper=source.keeper;
        this.seeker=source.seeker;
        this.chasers= source.chasers;
    }

    public String getHouse() {
        return house;
    }

    public String getKeeper() {
        return keeper;
    }

    public String getSeeker() {
        return seeker;
    }

    public String[] getChasers() {
        return Arrays.copyOf(chasers, chasers.length);
    }

    public void setChasers(String[] chasers) {
        if(chasers.length <3 || hasNull(chasers) || hasBlank(chasers)) throw new IllegalArgumentException("Invalid Aurgument");
        this.chasers = Arrays.copyOf(chasers, chasers.length);
    }

    public void setHouse(String house) {
        if(house ==null || house.isBlank()) throw new IllegalArgumentException("Can not be null");
        this.house = house;
    }

    public void setKeeper(String keeper) {
        if(keeper ==null || keeper.isBlank()) throw new IllegalArgumentException("Can not be null");
        this.keeper = keeper;
    }

    public void setSeeker(String seeker) {
        if(seeker ==null || seeker.isBlank()) throw new IllegalArgumentException("Can not be null");
        this.seeker = seeker;
    }

/* FREQUENTLY ASKED QUESTIONS:
    
Question: the constants are final, so why can't we make them public? It's not possible for the caller to update them.
  Answer: Even if the constant is final, I prefer to expose a method instead of the variable. But if you want to expose the variable, that's also correct.

*/

    
     public static String getPositionChaser() {
         return POSITION_CHASER;
     }

     public static String getPositionSeeker() {
         return POSITION_SEEKER;
     }

     public static String getPositionKeeper() {
         return POSITION_KEEPER;
     }

     public String toString(){
        return "House: " + this.house + "\n" +
          "Keeper: " + this.keeper + "\n" +         
          "Seeker: "  + this.seeker + "\n" +         
          "Chasers: " + Arrays.toString(this.chasers) + "\n";
     }

     public boolean equals(Object o){
        if(o==null) return false;
        if(o instanceof Team) return false;
        Team team = (Team)o;
        return this.house.equals(team.house) && 
        this.keeper.equals(team.keeper) &&
        this.seeker.equals(team.seeker) &&
        Arrays.toString(this.chasers).equals(Arrays.toString(team.chasers));
     }

     public int hashCode(){
         return Objects.hash(house, keeper,seeker, Arrays.toString(this.chasers));
     }
}

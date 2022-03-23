import java.util.Scanner;

public class DiceDoubles {
    public static void main(String[] args) {
        System.out.println("Lets start playing Dice!!");
        int dice1 = rollDice();
        int dice2 = rollDice();
        int counter=0;
        while(dice1!=dice2){
            System.out.println("Doubles value at counter "+counter+ "is == " + dice1 +"\t"+dice2);
            dice1 = rollDice();
            dice2 = rollDice();
            counter++;
        }
        System.out.println("Doubles value at counter "+counter+ "is == " + dice1 +"\t"+dice2);
    }

    public static int rollDice(){
        return (int)((Math.random() *6)+1);
    }
}

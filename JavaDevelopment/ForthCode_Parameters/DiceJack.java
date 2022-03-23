import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if(num1 <1 || num2 <1 || num3 <1){
            System.out.println("Numbers can not be less than 1. SHutting the gamedown");
            System.exit(0);
        }
        else if(num1>6 || num2>6 || num3 >6){
            System.out.println("Numbers can noy be greater than 6. Shutting the game down");
            System.exit(0);
        }
        int diceRolls = roll1+roll2+roll3;
        int numChoose = num1+num2+num3;
        if(checkWin(diceRolls, numChoose)){
            System.out.println("Congrats!!");
        }
        else System.out.println("You loose!!");
        scan.close();
    }

    public static int rollDice(){
        double random = Math.random()*6;
        random +=1; //Added one otherwise min value will be 0 and max will be 5
        return (int)random;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNum){
        return (sumDiceRolls<sumOfNum) && ((sumOfNum-sumDiceRolls)<3);
    }
}

import java.util.Scanner;

public class RockGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready to play? Enter Yes or No");
        String userInput = scan.nextLine();
        if(userInput.equals("Yes")){
            System.out.println("\nGreat!!");
            String userOptions = "rock-paper-scissor";
            System.out.println(userOptions);
            String userChoice = scan.nextLine();
            String comChoose = computerChoice();
            if(userOptions.contains(userChoice)){
                System.out.println("\n You choose : "+ userChoice);
                System.out.println("\n Computer choose : "+ comChoose);
                if(userChoice.equals(comChoose)){
                    System.out.println("Congrats");
                }
                else System.out.println("You loose");
            }
            else {
                System.out.println("Invalid input, shutting down!!");
                System.exit(0);
            }
        }
        else {
            System.out.println("Shutting down!!");
            System.exit(0);
        }
    }

    public static String computerChoice(){
        double random = Math.random()*3;
        int num = (int) random +1;
        switch(num){
            case 1:  return "rock";
            case 2: return "paper";
            case 3: return "scissor";
            default: return "Invalid range";
        }
    }
}

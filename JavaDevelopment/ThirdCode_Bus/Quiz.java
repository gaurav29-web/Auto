import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Country\na.India\nb.Brazil");
        String ans1 = scan.nextLine();
        System.out.println("\nEnter Your State\na.UP\nb.HP");
        String ans2 = scan.nextLine();
        System.out.println("\nEnter Your City\na.RBL\nb.Shimla");
        String ans3 = scan.nextLine();

        int score = 0;
        if(ans1.equals("a")) score +=40;
        if(ans2.equals("a")) score +=40;
        if(ans3.equals("a")) score +=20;

        if(score>=100) System.out.println("You Passed!!");
        else System.out.println("You failed!! Better luck next time");
        scan.close();
    } 
}

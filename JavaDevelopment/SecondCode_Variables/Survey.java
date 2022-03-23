import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        int counter=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Survey");
        System.out.println("Please enter your name ? ");
        String name = scan.nextLine();
        counter++;
        System.out.println("How much money you spend on coffee?");
        double coffee = scan.nextDouble();
        counter++;
        System.out.println("How many time you buy coffee?");
        int coffeeTimes = scan.nextInt();
        counter++;
        System.out.println("\nThank You " + name +" for answering all "+counter + " Questions!!");
        System.out.println("Your coffee prices are : $" +coffee*coffeeTimes);
        scan.close();
    }
}

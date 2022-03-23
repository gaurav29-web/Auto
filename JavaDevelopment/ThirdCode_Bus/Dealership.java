import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": 
            System.out.println("What is your budget"); 
            int budget = scan.nextInt();
            if(budget>=10000){
                System.out.println("Great!! A Nissan Ultima is available");
                System.out.println("\n Do you have insurance? Write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\nDo you have license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if(insurance.equals("yes") && license.equals("yes") && creditScore>660){
                    System.out.println("Sold!! Pleasure doing business");
                }
                else{
                    System.out.println("We are sorry!! You are not eligible");
                }
            }
            else System.out.println("We dont sell cars under 10000");
            break;
            case "b": 
            System.out.println("What is your car value at?"); 
            int value = scan.nextInt();
            System.out.println("What is your selling price?");
            int selPrice = scan.nextInt();
            if(value>selPrice && selPrice<30000){
                System.out.println("\nWe will buy your car. Pleasure doing business with you!!");
            }
            else System.out.println("\nWe are sorry, we can not buy your car!!");
            break;
            default : System.out.println("Invalid Option selected");
        }
        scan.close();
    }
}

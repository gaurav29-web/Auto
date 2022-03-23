import java.util.Scanner;

public class OrderPizza {
    public static void main(String[] args) {
        System.out.println("How many Topings you want?");
        Scanner scan = new Scanner(System.in);
        int numOfTopics = scan.nextInt();
        scan.nextLine();
        String[] pizza = new String[numOfTopics];
        System.out.println("Please enter topics you are expecting?");
        for(int i=0;i<numOfTopics;i++){
            pizza[i] = scan.nextLine();
        }
        System.out.println("Thank you for Order!! Driver will deliver pizza with below topings!!");
        for(int i=0;i<numOfTopics;i++){
            System.out.println(i+1+". "+ pizza[i]);
        }
        scan.close();
    }
}

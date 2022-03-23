import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("\nHi "+ name+ "! I am chatbot. Where you are from?");
        String place = scan.nextLine();
        System.out.println("\nI hear it is beautiful at "+place);
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        System.out.println("\nSo you are "+age);    
        System.out.println("\nWhat language you like?");  
        scan.nextLine();//added otherwise next line for language is skipped
        String language = scan.nextLine();
        System.out.println("\nGreat you like "+language);          
        System.out.println("\nThank you for your time with chatbot!!");
    }
}

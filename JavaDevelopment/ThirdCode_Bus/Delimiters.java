import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter two very big integers on the same line");
        long big1 = scan.nextLong();
        long big2 = scan.nextLong();
        System.out.println("Enter two decimals on the same line");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();
        System.out.println("Enter two text on the same line");
        String str1 = scan.next();
        String str2 = scan.next();
        scan.close();

        System.out.println("\tIntegers : "+ num1 + " " + num2);
        System.out.println("\tBigNumbers : "+ big1 + " " + big2);
        System.out.println("\tDecimals : "+ dec1 + " " + dec2);
        System.out.println("\tStrings : "+ str1 + " " + str2);
    }
}

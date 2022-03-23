import java.util.Scanner;

public class UserChoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] items = {"Coffee", "Tea", "Snacks"};
        String userChoice = scan.nextLine();
        int flag=0;
        for(int i=0;i<items.length;i++){
            if(items[i].equals(userChoice)){
                System.out.println("We serve you!!");
                flag=1;
                break;
            }}
if(flag==1){
    System.out.println("USer choice fulfilled");
}
else System.out.println("We are sorry!!");
scan.close();
        }
}

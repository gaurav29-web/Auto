import java.util.Scanner;
public class Forecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp =scan.nextInt();
        String forecast = "";
        if(temp>=-15 && temp<=0){
            forecast="The forecast is FREEZING! Stay home!";
            System.out.println(forecast);
        }
        else if(temp>=0 && temp<=10){
            forecast="The forecast is Chilly! Stay home!";
            System.out.println(forecast);
        }
        else{
            forecast="It is warm";
            System.out.println(forecast);
        }
    }
}

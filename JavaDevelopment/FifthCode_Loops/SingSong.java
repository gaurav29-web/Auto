import java.util.Scanner;

public class SingSong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times you want me to sing the song?");
        int numSong = scan.nextInt();
        for(int i=numSong;i>1;i--){
            System.out.println("I will sing song.... "+i);
        }
        scan.close();
    }
}

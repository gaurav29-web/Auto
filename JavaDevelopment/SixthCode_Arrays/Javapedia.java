import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        System.out.println("**********Javapedia***********");
        System.out.println("How many Historical figures will you register?");
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        scan.nextLine();
        String[][] database = new String[people][3];
        for(int i =0;i<database.length;i++){
            System.out.print("\t . Name ");
            database[i][0]=scan.nextLine();
            System.out.print("\t . Date Of Birth ");
            database[i][1]=scan.nextLine();
            System.out.print("\t . Occupation ");
            database[i][2]=scan.nextLine();
            System.out.print("\n");
        }
        System.out.println("These are the values stored");
            print2DArray(database);

            System.out.println("Which user info you need?");
            int flag =0;
            String name = scan.nextLine();
            for(int i=0;i<database.length;i++){
                if(name.equalsIgnoreCase(database[i][0])){
                    System.out.println("User details are == ");
                    System.out.println("Name: "+database[i][0]);
                    System.out.println("DOB: "+database[i][1]);
                    System.out.println("Occupation: "+database[i][2]);
                    flag =1;
                }
            }
            if(flag==0){
                System.out.println("User not found!!");
            }
            scan.close();
    }

    public static void print2DArray(String[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }

    }
}

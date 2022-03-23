import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
       // int [][] grades = new int[3][4];
        /*grades[0][0]= 72;
        grades[0][1]= 72;
        grades[0][2]= 72;
        grades[0][3]= 72;
        grades[1][0]= 73;
        grades[1][1]= 73;
        grades[1][2]= 73;
        grades[1][3]= 73;
        grades[2][0]= 74;
        grades[2][1]= 74;
        grades[2][2]= 74;
        grades[2][3]= 74;*/
        int[][] grades = {
            {72,73,74},
            {82,83,84},
            {87,72,73}
        };
        System.out.println("\tTim: " +Arrays.toString(grades[0]));
        System.out.println("\tJim: "+Arrays.toString(grades[1]));
        System.out.println("\tJoe: "+Arrays.toString(grades[2]));

        for(int j =0; j<grades[0].length;j++){
            System.out.print(grades[0][j]+" ");
        }
        System.out.println();
        for(int j =0; j<grades[1].length;j++){
            System.out.print(grades[1][j]+" ");
        }
System.out.println();
        for(int j =0; j<grades[2].length;j++){
            System.out.print(grades[2][j]+" ");
        }
System.out.println();
        for(int i=0;i<grades.length;i++){
            for(int j=0;j<grades[i].length;j++){
                System.out.print(grades[i][j] +" ");
            }
            System.out.println();
        }
    }
}

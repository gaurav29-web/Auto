import java.util.Arrays;

public class PrintStars {
    public static void main(String[] args) {
      //  PrintStars.PrintRevDiagnonal();
      //  PrintStars.PrintMatrixWithIndex();
      //PrintStars.Tiktok();
      //PrintStars.lowerTriangle();
      PrintStars.transpose();
    }

    public static void PrintRevDiagnonal(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i+j==4) System.out.print("*");
                else System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static void PrintMatrixWithIndex(){
        int [][] mat = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = j;
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    public static void Tiktok(){
        char [][] mat = {{'_','_','_'},
        {'_','_','_'},
        {'_','_','_'}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i+j==2){
                    mat[i][j]='O';
                }
                else if((i==j) && (i!=1)){
                    mat[i][j]='X';   
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    public static void lowerTriangle(){
        int[][] mat = {{1,2,3},
        {1,2,3},
        {1,2,3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i<j){
                    mat[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    public static void transpose(){
        int[][] mat= {{1,2,3},
                        {4,5,6},
                    {7,8,9} };
                    int[][] transpose=new int[mat.length][mat[0].length];
                    for (int i = 0; i < mat.length; i++) {
                        for (int j = 0; j < mat[i].length; j++) {
                            transpose[i][j]= mat[j][i];
                        }
                    }
                    System.out.println(Arrays.deepToString(transpose));
                }
}

import java.util.Scanner;

public class TicTac {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Lets play Tic Tac Toe!!");
        char[][] board = {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
        };
        printBoard(board);

        for(int i=0;i<9;i++){
            if(i%2==0){
                System.out.println("Turn X");
                int[] spot=askUser(board);
                board[spot[0]][spot[1]]='X';
            }
            else{
                System.out.println("Turn O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]]='O';
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board){
        System.out.println();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int[] askUser(char[][] board){
        System.out.println("Pick up a row and column : ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        return new int[] {row,element};
    }
}

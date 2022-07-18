package backTracking;
import java.util.Scanner;

public class N_queens {

    public static void display(int [][] chess){

        for(int i = 0;i<chess.length;i++){
            for(int j = 0;j<chess.length;j++){
                // System.out.print(chess[i][j]);
                display(chess);
            }
            // System.out.println();
        }

    }

    public static boolean isSafe(int [][] chess,int row ,int col){
        // top left Corner
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }
    // top
   for (int i = row - 1, j = col; i >= 0; i--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }
    //top rigth Corner
   for (int i = row - 1, j = col + 1; i >= 0
        && j < chess.length; i--, j++) {
     if (chess[i][j] == 1) {
       return false;
     }
   }
   // left
   for (int i = row, j = col - 1; j >= 0; j--) {
     if (chess[i][j] == 1) {
       return false;
     }
   }
        return true;
    
    }

    // public static int [][] dirX = { {-1,-1},{-1,0},{-1,1},{1,-1}  };\\\\\\\\

    // public static String [] dirN = {"leftCorner","up","rightCorner","left"};

    public static void chessBoard(int [][] chess,int row,String ans){

        //base cases

        if(row  == chess.length){
            System.out.println(ans);
            return;
        }

        if(row < 0 || row > chess.length){
            return;
        }
        // move the queen

        for(int col = 0;col<chess[0].length;col++){
            if(isSafe(chess, row, col) == true && chess[row][col] == 0){
                chess[row][col] =1;
                chessBoard(chess, row+1, ans+row+""+col+",");
                chess[row][col] = 0;

            }

            
            }

            
        

    

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [][] chess = new int[n][n];

        for(int i = 0;i<chess.length;i++){
            for(int j = 0;j<chess.length;j++){
                chess[i][j] = scn.nextInt();
            }
        }



        // int [][] chess = {
        //     {0,0,0,0},
        //     {0,0,0,0},
        //     {0,0,0,0},
        //     {0,0,0,0}
        // };


        

       chessBoard(chess, 0, "");
     
        
    }
    
}


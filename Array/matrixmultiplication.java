

import java.util.Scanner;

public class matrixmultiplication{
    public static  Scanner scn = new Scanner(System.in);


    public static int [][] multrix(int [][] A,int [][] B){
        
        int rowA = A.length;
        int colA = A[0].length;

        int rowB = B.length;
        int colB = B[0].length;


        int [][] ans = new int [rowA][colB];
        
        for(int i = 0;i<rowA;i++){
            
            for(int j = 0;j<colB;j++){
                int sum = 0;

               for(int k = 0;k<rowB;k++){

                sum+= A[i][k] * B[k][j];
               }

               ans[i][j]  = sum;
            }
            
        }


        return ans;
    }

    public static void input(int [][] A){


        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){

                A[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int [][] A){


        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){

               System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

       


        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] A = new int[n][m];
        input(A);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int [][] B = new int[x][y];
        input(B);


        int [][] C = multrix(A,B);
        display(C);
        // display(B);
    }
}

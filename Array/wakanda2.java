import java.util.Scanner;

public class wakanda2  {

    public static void gapstategy(int [][] arr){

        int n = arr.length;

        for(int i =0;i<n;i++){
            for(int j = i,k = 0;j<n;j++,k++){
                System.out.print(arr[k][j] + "\t");
            }
            System.out.println();
        }

    }

    

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);

   

        // int [][] arr  = new int  = {{11,12,13,14},
        //                             {21,22,23,24},
        //                             {31,32,33,34},
        //                             {41,42,43,44}};



          
        int n = scn.nextInt();
        
        int [][] arr = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        gapstategy(arr);
    }

}
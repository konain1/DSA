import java.util.Scanner;

import javax.swing.SpinnerDateModel;

public class stateofwakanda {
    public static void wakanda(int [][] arr){


        for(int col = 0;col < arr.length;col++){
            
            if(col%2==0){
                for(int row = 0;row<arr.length;row++){
                    System.out.print(arr[row][col]);
                    
                }
                }else {
                    for(int row = arr.length-1;row>=0;row--){
                        System.out.print(arr[row][col]);
                        
                    }
                }
                System.out.println();
            }

        }
    
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [][] arr = new int [n][n];

        for(int i = 0;i<n;i++){
           for(int j = 0;j<n;j++){
               arr[i][j] = scn.nextInt();
           }
        }
        wakanda(arr);
    }
}



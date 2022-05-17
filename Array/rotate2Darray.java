

import java.io.*;
import java.util.*;

public class rotate2Darray{
    
    
    public static void transpose(int [][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    public static void reverse(int [][] arr){
            
            int n = arr.length;
        
        for(int row = 0;row<n;row++){
            int li = 0;
            int ri = n-1;
            
            while(li<ri){
                // int temp = arr[row][ri];
                // int arr[row][ri] = arr[row][li];
                // arr[row][li] = temp;
                
                
                int temp = arr[row][li];
                arr[row][li] = arr[row][ri];
                arr[row][ri] = temp;
                li++;
                ri--;
            }
            
        }
    }

    public static void main(String[] args) throws Exception {
        
        
        
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int [][] arr = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        transpose(arr);
        reverse(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
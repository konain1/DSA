
import java.io.*;
import java.util.*;

public class exitpoint  {
    public static Scanner scn = new Scanner(System.in);
    
    public static void exitpoint(int [][] arr){
        
        int dir = 0;
        int n = arr.length;
        int m = arr[0].length;
        
        int i = 0;
        int j = 0;
        
        while(true){
            dir += arr[i][j];
            
            dir %= 4;
            
            if(dir == 0){
                j++;
            }
            else if(dir == 1){
                i++;
                
            }else if(dir == 2){
                j--;
            }else {
                i--;
            }
            
            
            if(i< 0 || i>= n || j < 0 || j >= m ){
                break;
            }
            
        }
        
        if(i < 0 ){
            i++;
        }else if(i >= n){
            i--;
        }else if(j<0){
            j++;
        }else if(j>=m){
            j--;
        }
        
        System.out.println("i index"+i);
        System.out.println("j index"+j);
        
    }
    
    public static void input(int [][] A){


        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){

                A[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int [][] arr = new int[n][m];
        
        input(arr);
        exitpoint(arr);
    }

}

import java.util.*;

public class searchX2D{
    
    public static void findX(int [][] arr, int x ){
        
        int n = arr.length;
        int i = 0;
        int j = n-1;
         
        
        while(j>= 0 && i <= n-1){
            
            int me = arr[i][j];
            
            if(x == me){
                System.out.println("i index = "+i);
                System.out.println("j index = "+j);
                return;
            }
            else if(x > me){
                i++;
                
            }else {
                j--;
            }
            
            
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        
        int n = scn.nextInt();
        
        int [][] arr = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
         int x = scn.nextInt();
         scn.close();
    
         findX(arr,x);
    }
    
   

}
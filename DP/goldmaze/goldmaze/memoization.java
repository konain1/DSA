package goldmaze;

import java.util.Scanner;


public class memoization {


    public static int goldmaze(int i , int j,int [][] arr,int [][]dp){
        if(i<0 || i>=arr.length || j>=arr[0].length){
            return 0;
        }
        if(dp[i][j] !=0){
            return dp[i][j];
        }
        
        int op1 = goldmaze(i-1,j+1,arr,dp);
        int op2 = goldmaze(i,j+1,arr,dp);
        int op3 = goldmaze(i+1,j+1,arr,dp);
        
        int max = Math.max(op1,Math.max(op2,op3));
        dp[i][j] = max+ arr[i][j];
        
        return dp[i][j];
    
        
        
    }
    public static void main(String[] args) throws Exception {
        
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int ans = 0;
        
        int [][] arr = new int[n][m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int [][] dp = new int[n][m];
        
        
        for(int i =0;i<n;i++){
            int temp = goldmaze(i,0,arr,dp);
            
            if(temp > ans){
                ans = temp;
            }
        }
        
        System.out.println(ans);
    }

}
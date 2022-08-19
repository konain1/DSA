

import java.util.*;
import java.lang.*;

public class memoization{

    public static int  max(int a,int b){
        return (a>b) ? a : b;
    }

    public static int knapsack(int [] val,int [] wt,int W,int n,int [][] dp){

        if(n == 0 || W == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] > W){
            return  dp[n][W] = knapsack(val, wt, W, n-1,dp);
        }else {
            return  dp[n][W] = max(val[n-1] + knapsack(val, wt , W-wt[n-1], n-1,dp),knapsack(val, wt, W, n-1,dp));
        }

        
    }
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        int [][] dp = new int[n+1][W+1];
       System.out.println(n);
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=W;j++){
                dp[i][j] = -1;
        }}

        // for(int i = 0; i <= n ; i++)  
        // for(int j = 0; j <= W ; j++)  
        //     dp[i][j] = -1; 
       
      
        System.out.println(knapsack(val,wt,W,n,dp));

       
    }
}

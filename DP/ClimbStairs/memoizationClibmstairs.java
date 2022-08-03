

import java.io.*;
import java.util.*;

public class memoizationClibmstairs{
    public static int gotoTop(int n,int [] dp){
        if(n == 0){
            return dp[n] = 1;
        }
        int count= 0;
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        if(n-1 >= 0){
            count += gotoTop(n-1,dp);
        }
        if(n-2 >= 0){
          count += gotoTop(n-2,dp);
        }
        if(n-3 >=0){
          count += gotoTop(n-3,dp);
        }
        
        return dp[n] = count;
    }
    
  
    
  

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] dp = new int[n+1];
        
        Arrays.fill(dp,-1);
        
      int ans = gotoTop(n,dp);
    //   int ans = climbStairM(n,dp);
       
       System.out.println(ans);
    }

}
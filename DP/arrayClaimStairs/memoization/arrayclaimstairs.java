
import java.util.*;

public class arrayclaimstairs {
    public static int gotoTop(int [] arr ,int sc,int n,int [] dp){
     
     if(sc == n){
       return dp[sc]=1;  
     }
    
    int count = 0;
    for(int i = 1; i<=arr[sc] && i + sc <= n; i++){
        count += gotoTop(arr,sc+i,n,dp);
    }
     
     return dp[sc] = count;
    }
    
  
    
  

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int [] dp = new int[n+1];
        
        Arrays.fill(dp,0);
        
        int [] arr = {3,2,1,2,0};
        
      int ans = gotoTop(arr,0,n,dp);
      
    //   int ans = climbStairM(n,dp);
       
       System.out.println(ans);
    }

}
import java.util.Arrays;
import java.util.Scanner;
public class memoization {

    public static int fiboM(int n,int [] dp){
        if(n<= 1){
            return dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        int last = fiboM(n-1, dp);
        int slast = fiboM(n-2, dp);
        return  last + slast;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n  = scn.nextInt();
    

        int [] dp = new int[n+1];

        Arrays.fill(dp,-1);

       int ans =  fiboM(n,dp);
       System.out.println(ans);
    }
}
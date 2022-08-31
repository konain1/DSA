import java.util.*;

public class fibo {
    public static int fibonacci(int n , int [] dp){

        if(n  ==  1){
            return 1;
        }
        if( n == 0){
            return 0;
        }
        // check dp

        if(dp[n] != -1){
            return dp[n];
        }


        dp[n] = fibonacci(n-1, dp) + fibonacci(n-2, dp);




        return dp[n];
    }

    // tabulation 


    public static int fibonacciTabulation(int n , int [] dp){;


        dp[1] = 1;
        dp[0] = 0;


        for(int i =2;i<=n;i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }


    // brain storming 

    public static int fibonacciBrainStorming(int n){

        int prev1 = 1;
        int prev2 = 0;

        for(int i = 2;i<=n;i++){
            int c = prev1  + prev2;

            prev2 = prev1;
            
            prev1 = c;
            
            
            }
        return prev1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] dp = new int[n+1];

        Arrays.fill(dp,-1);

        int ans = fibonacci(n , dp);
        int tb = fibonacciTabulation(n, dp);
        int br = fibonacciBrainStorming(n);
        System.out.println(br);
    }
}
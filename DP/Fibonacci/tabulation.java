import java.util.Scanner;
public class tabulation {

     public static int fiboT(int N,int []dp){

        for(int n = 0;n<dp.length;n++){
            if(n<= 1){
               dp[n] = n;
                continue;
            }

           int last = dp[n-1];
           int slast = dp[n-2];
           dp[n] = last+slast;
        }

        return dp[N];
     }

    
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] dp = new int[n+1];

       int ans =  fiboT(n,dp);
       System.out.println(ans);
    }
    
}
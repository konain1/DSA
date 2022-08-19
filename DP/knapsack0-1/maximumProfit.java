import java.util.*;

public class maximumProfit {

    public static int  max(int a,int b){
        return (a>b) ? a : b;
    }

    public static int knapsack(int [] val,int [] wt,int W,int n){

        if(n == 0 || W == 0){
            return 0;
        }

        if(wt[n-1] > W){
            return knapsack(val, wt, W, n-1);
        }else {
            return max(val[n-1] + knapsack(val, wt , W-wt[n-1], n-1),knapsack(val, wt, W, n-1));
        }

        
    }
    public static void main(String[] args) {
       

        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapsack(val,wt,W,n));
        
    }
}
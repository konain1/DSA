import java.util.*;


public class Nstairs {
    public static int gotoTopStair(int n,int i){
        if(i == n){
            return 1;
        }

        if(i > n ){
            return 0;
        }

      int ans =  gotoTopStair(n, i+1) + gotoTopStair(n, i+2);
        

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

       int ans = gotoTopStair(n,0);
       System.out.println(ans);
        
    }
}

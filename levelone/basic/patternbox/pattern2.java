import java.util.*;

public class pattern2 {
    
    public static void pattern2(int n){
        
        int nst = n, nsp = 0;
        
        for(int r = 1;r<=n;r++){
            
            for(int cst = 1;cst <= nst;cst++){
                System.out.print("*\t");
            }
            
            for(int csp = nsp; csp<=nsp;csp++){
                System.out.print("\t");
            }
            
            
            System.out.println();
            
            nst--;
            nsp++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        pattern2(n);

    }
}
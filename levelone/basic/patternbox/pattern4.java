import java.util.*;

public class pattern4 {
    
    public static void pattern4(int n){
        
        int nst = n, nsp = 0;
        
        for(int r = 1;r<=n;r++){
            
            
            for(int csp =1 ; csp<=nsp;csp++){
                System.out.print("\t");
            }
            
            for(int cst = 1;cst <= nst;cst++){
                System.out.print("*\t");
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
        
        pattern4(n);

    }
}
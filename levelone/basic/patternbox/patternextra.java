import java.util.*;

public class patternextra {
    
    public static void extra(int n){
        
        int nst = 1, nsp = n-1;
        
        for(int r = 1;r<=n;r++){
            
            
            for(int csp =1 ; csp<=nsp;csp++){
                System.out.print("\t");
            }
            
            for(int cst = 1;cst <= nst;cst++){
                System.out.print("*\t");
            }
            
            
            
            
            
            System.out.println();
            
            nst=nst+2;
            nsp--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        extra(n);

    }
}
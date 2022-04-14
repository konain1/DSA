import java.util.*;

public class pattern15{


    public static void p15(int n){
        int nsp = n/2,nst = 1; 
        

        for(int r = 1;r<=n;r++){

            
            //space
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
                

            }
            
            int val = (r<=n/2 +1)? r:n-r+1;
            //star
            for(int cst=1;cst<=nst;cst++){
                System.out.print(val+"\t");
                val = (cst<=nst/2)?val+1:val-1;
               
            }

            System.out.println();
            //conditions
            
            if(r<= n/2){
                nsp--;
                nst+=2;
                val++;
            }
            else {
                nsp++;
                nst-=2;
                 val--;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        p15(num);

        // write ur code here

    }
}
import java.util.*;

public class pattern16_2{


    public static void p16(int n){
        int nsp = n+1,nst = 1; 
        

        for(int r = 1;r<=n;r++){

            //first star
            int count = 0;
            for(int cst=1;cst<=nst;cst++){
                count++;
                System.out.print("*\t");

               
                // count = (cst <= nst/2+1)?count+1:count-1;
            }
                nst++;
//              spaces
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            
            
            if(r == n){
               nst--;
            }

            // if(r==n)count--;
            
            //star2
            int nextcount = count - 1;
            for(int cst=count;cst>=1;cst--){
                
                // count = (cst <= nst/2+1)?count-1:count+1;
                System.out.print("*\t");

                
            }
            
            System.out.println();
            nsp-=2;
            // nst++;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        p16(num);

        // write ur code here

    }
}
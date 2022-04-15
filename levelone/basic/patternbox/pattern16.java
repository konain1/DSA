import java.util.*;

public class pattern16{


    public static void p16(int n){
        int nsp = n*2-3,nst = 1; 
        int nxt = 0;
        for(int r = 1;r<=n;r++){

            //first star
            int count = 1;
            for(int cst=1;cst<=nst;cst++){
                
                nxt=count;
                System.out.print(count+"\t");
                count++;

               
                // count = (cst <= nst/2+1)?count+1:count-1;
            }

//              spaces
            for(int csp = 1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            
            
            if(r == n){
                nst--;
            }

            // if(r==n)count--;
            
            //star2
            // int nextcount = count - 1;
            // for(int cst=nst;cst>=1;cst--){
                
            //     // count = (cst <= nst/2+1)?count-1:count+1;
            //     System.out.print(cst+"\t");

                
            // }
                if(r==n)nxt--;
            for(int cst = 1;cst<=nst;cst++){
                
                System.out.print(nxt+"\t");
                nxt--;
            }
            
            System.out.println();
            nsp-=2;
            nst++;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        p16(num);

        // write ur code here

    }
}
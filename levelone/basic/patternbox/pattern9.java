import java.util.*;

public class pattern9 {
    public static void p9matrix(int n){
        
        
       
        for(int r = 1;r<=n;r++){
            
            for(int col = 1;col<=n;col++){
                if(col==r || col+r == n+1){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int num = scn.nextInt();
        
        p9matrix(num);

    }
}
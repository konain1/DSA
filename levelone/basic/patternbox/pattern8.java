import java.util.*;

public class pattern8 {
    
    public static void pttr8(int n){
        
        for(int row = 1;row <= n;row++){
            for(int col=1;col<=n;col++){
                if(row +col == n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        scn.close();

        
        pttr8(n);

    }
}
import java.util.Scanner;

public class powerLiner {

    public static int powerOfx(int x,int n){

        if(n <= 0){
            return 1;
        }
        
       int r = powerOfx(x, n-1);
       return r * x;
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

       int re =  powerOfx(2,7);
       System.out.println(re);
    }
    
}

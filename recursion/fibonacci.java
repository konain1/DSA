import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        int last =  fibo(n-1);
        int slast = fibo(n-2);
 
        return last + slast;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        int result = fibo(n);
        System.out.println(result);
      

        
    }
}

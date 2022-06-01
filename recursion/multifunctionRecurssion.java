import java.util.Scanner;

// fibonacci function writing by recurssion


public class multifunctionRecurssion {

    public static int fibonacci(int n){

        //terminated condition

        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);

        return last + slast;


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter a number ");
        int n = scn.nextInt();

        int result = fibonacci(n);

        System.out.println(result);


    }
    
}

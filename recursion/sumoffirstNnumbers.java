import java.util.Scanner;

public class sumoffirstNnumbers {
    public static void fun(int n , int sum){

        if(n<1){
            System.out.println(sum);
            return;
        }

        fun(n-1,sum+n);


    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("enter N number");
        int n = scn.nextInt();

        fun(n,0);
        
    }
}

import java.util.Scanner;

public class factRucurssion{

    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n * fact(n-1);

    }


    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("enter factorial number");
        int n = scn.nextInt();
        System.out.println(fact(n));
    }
}

import java.util.Scanner;

public class powerlog {

    public static int logo(int x , int n){

        if(n ==0){
            return 1;
        }

        int r = logo(x,n/2);

        int myans = r * r;
        if(n % 2 !=0){
            myans *= x;
        }

        return myans;
    }
    public static void main(String[] args) {

        int x = 2;

       int result =  logo(x,5);
       System.out.println(result);
        
    }
}

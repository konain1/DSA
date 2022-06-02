import java.util.Scanner;

public class printzigzak {

    public static void zigzak(int n){
        if(n == 0){
            return;
        }

        System.out.print(n+" ");
        zigzak(n-1);
        System.out.print(n+" ");
        zigzak(n-1);
        System.out.print(n+" ");
    }


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("enter n");

        int n = scn.nextInt();

        zigzak(n);
        
    }
    
}

import java.util.Scanner;
public class gcdAndlcm {

    public static int gcd(int n1,int n2){

        int gcd = 0;
        // int a = n1 , b = n2;
        while(n1!=0){
            int temp = n1;
            n1 = n2%n1;
            n2 = temp;
            gcd = n2;
        }
        
       
        return gcd;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int n2 = scn.nextInt();

        int result = gcd(n1, n2);
        int lcm = (n1*n2)/result;
        System.out.println("gcd = "+ result + " lcm = "+lcm);

      
      
        
    }
    
}


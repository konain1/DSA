
import java.util.Scanner;

public class anyBaseSubtraction  {


    public static int getDifference(int b , int n1 , int n2){

        int ans = 0, pow = 1;
        int borrow = 0;
       
        while( n2!=0){
            int sub =   (n2 %10 - n1%10)-borrow ;  //72  1-6 = 
                                                  //16
            n1/=10;
            n2/=10;

            if(sub<0){
                borrow = 1;
                sub+=b;
            }
            else borrow = 0;


            ans += sub * pow;
            pow = pow *10;
        }
       
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter values");
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int result = getDifference(b,n1, n2);
        System.out.println(result);
        

       
    }
    
}

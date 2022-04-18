

import java.util.Scanner;
public class AnybaseAddition  {


    public static int anyBaseAdd(int n,int m,int b){
        int carry = 0,pow = 1; 
        int ans = 0;
        while(carry !=0 || n!=0 || m!=0){
            int sum = carry + n%10 + m%10;
            n /= 10;
            m /= 10;
            carry = sum /b;
            sum %=b;
            ans += pow * sum;
            pow *= 10;
        }
        return ans;


    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int b = scn.nextInt();

        int result = anyBaseAdd(n,m,b);
        System.out.println("addtion = "+result);
        
    }
    
}

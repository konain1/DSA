import java.util.Scanner;

public class anybaseMultiplication {


    public static int anyBaseAdd(int b,int n,int m){
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


    public static int digitMul(int b,int n , int dgt){

        int ans  = 0, pow = 1 , carry = 0;

        while(n!=0 || carry !=0){
            int digproduct = (n%10 * dgt) + carry;
            n/=10;
            
            int prod = digproduct % b;
            carry = digproduct / b;


            ans+= prod *  pow;
            pow *=10;

        }return ans;
    }

    public static int getproduct(int b,int n,int m){
        int ans =0 , pow = 1;

        while(m!=0){

            int getans = digitMul(b, n, m%10);
            m/=10;

            ans =  anyBaseAdd(b,ans,getans * pow);
            pow = pow*10;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();

        int result  = getproduct(b, n, m);
        System.out.println(result);

    }
    
}

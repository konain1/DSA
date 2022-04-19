import java.util.Scanner;




public class decimalMultiplication {




public static int decAdd(int n,int m){
    int carry = 0,pow = 1; 
    int ans = 0;
    while(carry !=0 || n!=0 || m!=0){
        int sum = carry + n%10 + m%10;
        n /= 10;
        m /= 10;
        carry = sum /10;
        sum %=10;
        ans += pow * sum;
        pow *= 10;
    }
    return ans;


}

     public static int mul(int b,int n1,int dig){
         int ans = 0;
        

             int pow = 1;
             int carry = 0;
             while(n1!=0 || carry !=0){
                 int product = (n1%10 *dig )+ carry;
                n1=n1/10;
                 int result = product % 10;
                 carry = product / 10;
                 ans+= result * pow;
                 pow*=10;
             }
             return ans;
         
         
     }

     public static int getprod(int b,int n,int m){
         int ans = 0 , pow = 1;

         while(m!=0){

            int digitmultiplied  = mul(b,n,m%10);
            m/=10;
            ans = decAdd(ans,digitmultiplied*pow);
            pow = pow * 10;

         }
         return ans;
     }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n= scn.nextInt();
        int m= scn.nextInt();

        // int getproduct = mul(b,n1,n2);
        int result = getprod(b, n, m);
        
        
        System.out.println(result);
        
    }
}

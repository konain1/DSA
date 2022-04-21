import java.util.Scanner;
public class rotate {

    public static int counter(int n){

        int count =0;
        while(n!=0){
            count++;
            n/=10;

        }
        return count;
    }

    public static int rotateNumber(int n , int k){

        int len = counter(n);
        int ans = 0;

        k = k % len;
        if(k<0){
            k = k + len;
           
        }
        
        int remain = n / (int)Math.pow(10,k);

        // System.out.println("remain"+remain);

        int last = n % (int)Math.pow(10,k);

        // System.out.println("last" +last);

        ans += last*Math.pow(10,len-k) + remain;

        return ans;

    }
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int ne = rotateNumber(n, k);

        System.out.print(ne);
        
    }
    
}

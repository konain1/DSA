import java.util.Scanner;


public class sumof2array {

    public static void sumArray(int[] n1,int[] n2){
     
        int i = n1.length-1;// here i is represent the index number not index size
        int j = n2.length-1;// here j is represent the index number not index size

        // int size = (n1.length > n2.length)?n1.length:n2.length;
        int size = n1.length;

        int [] ans = new int [size];

        int k = ans.length-1; // k is index number not size of an array

        int carry = 0;
        

        
        while(k>=0){
            int sum = 0;

           sum += carry;

            if(i>=0){
                sum= sum + n1[i];
            }

            if(j>=0){
                sum=sum+n2[j];
            }

            carry = sum/10;

 
            int val =  sum%10;
            ans[k] = val;  // here k is represent the index number not index size

            j--;
            i--;
            k--;
        }
        for(int ele :ans){
            System.out.println(ele);
        }
        // return ans[k];



    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int [] A = new int[n];
        //input element
        for(int i = 0;i<n;i++){
            A[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int [] B = new int[m];
        //input elements
        for(int i = 0;i<m;i++){
            B[i] = scn.nextInt();
        }

        sumArray(A,B);
        // System.out.println(add);
    }
    
}

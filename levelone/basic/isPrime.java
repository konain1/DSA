import java.util.Scanner;

public class isPrime {


     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

        // boolean isPrimenum = true;
        //  int num = scn.nextInt();
        // for(int i= 2; i < num;i++){

        //     if(num % i == 0){
        //         isPrimenum = false;
        //         break;
        //     }
        // }
        // if(isPrimenum){
        //     System.out.println(num + " isPrime");
        // }else {
        //     System.out.println(num+" not a prime");
        // }
        int a= scn.nextInt(),b =scn.nextInt();
        scn.close();
        allprime(a,b);

        

       
    }
    public static boolean isprime(int num){

            
        for(int i = 2;i<num;i++){
            if((num%i)==0){
                return false;
                
            }
            
        }
        return true;
        
    }

    public static void allprime(int low,int high){
        for(int i = low; i<=high;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
};
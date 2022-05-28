import java.util.ArrayList;
import java.util.Scanner;

public class allprimeRemove {

    public static boolean isPrime(int x){

        
        for(int i = 2;i<x;i++){
            if(x % i == 0){

                
                return false;
            }   
        }
       
        return true;
    }


    public static void main(String[] args) {


        
        Scanner scn = new Scanner(System.in);

        ArrayList <Integer> al = new ArrayList <>();
        System.out.println("enter n value");
        int n = scn.nextInt();

        for(int i =0;i<n;i++){
            al.add(scn.nextInt());
        }


        for(int i = al.size()-1; i>=0; i--){
            
            // System.out.println(al.get(i));
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }

       
        System.out.println(al);

    }
    
}

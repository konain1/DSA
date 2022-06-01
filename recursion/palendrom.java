import java.util.Scanner;


public class palendrom {

    public static boolean reversepalnedrom(String str,int i){
        int n = str.length();

        if(i>=n/2){
            return true;
        }

        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
        return reversepalnedrom(str, i+1);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);   
        System.out.println("enter a String palendrom");

        String str = scn.next();
        

       boolean result = reversepalnedrom(str,0);
       System.out.println(result);
        
    }
}

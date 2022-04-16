
import java.util.*;
  
  public class anybasetoanybase{


    public static int decimaltoBase(int n, int b){
        // write code here
        
        int pow = 1 , ans = 0;
        
        while(n!=0){
            int rem =  n % b;
            
            n= n / b;
            ans +=rem*pow;
            pow = pow *10;
        }
        return ans;
    }


    // public static int anyBtoanyB(int n,int b){

    // //    int getdec = anybasetodecimal(n,b);

    //    int getbase = decimaltoBase(n,b);

    //    return getbase;
    // }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int getdec = anybasetodecimal(n, b);
      int d = decimaltoBase(getdec,b);
      System.out.println(d);
   }
  
   public static int anybasetodecimal(int n, int b){
      // write your code here
      
       int pow = 1 , ans = 0;
       
       while(n!=0){
           int rem =  n % 10;
           
           n= n / 10;
           ans +=rem*pow;
           pow = pow *b;
       }
       return ans;
   }


   
  }
import java.util.*;

public class inv{
    
    public static int inverse(int num){
        
        int ans = 0;
        int index = 1, ld = 0;
        
        while(num !=0){
            
            
            
            ld = num %10;
            
            ans = ans + index * (int)Math.pow(10,ld-1);
            
            num = num /10;
            index++;
            
        }
        return ans;
    }

public static void main(String[] args) {
  // write your code here  
  
  Scanner scn = new Scanner(System.in);
  
  int num = scn.nextInt();
  
  int result = inverse(num);
  
  System.out.println(result);
  
 }
};
import java.util.*;

public class pattern10{
    
    public static void p10(int n){
        
        int nsp1 = n/2 , nsp2 = -1;
        
        
        //row loop
        for(int r = 1; r<=n;r++){
            
            
            //outer space
            for(int csp1 = 1;csp1<=nsp1;csp1++){
                System.out.print("\t");
            }
                
                //star
                
                System.out.print("*\t");
                
                //inner space
                
                if(r != 1){
                   
                  for(int csp2=1;csp2<=nsp2;csp2++){
                      System.out.print("\t");
                  }
                }
                
                //second star
                 if(r != 1 && r != n ){
                   
                   
                      System.out.print("*\t");
                   
                }
                
                 System.out.println();
                
                //condition
                
                
                if(r <= n/2){
                    nsp1--;
                    nsp2+=2;
                    
                }
                else{
                    nsp1++;
                    nsp2-=2;
                }
                
                
               
            }
        }
        
    

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
     int num = scn.nextInt();
     
     p10(num);

 }
}
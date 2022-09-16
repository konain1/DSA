import java.util.*;

class main {
    
    public static int findminWay(int [] arr,int target){
        int a,b,c;
        if(target == 0){
           
            return 1;
        }
      
         for(int i = 0;i<arr.length;i++){
            if(target > 1){
               a =  findminWay(arr, target- 1);
                
            }
            if(target > 2){
               b = findminWay(arr, target- 2);
            }
            if(target > 3){
                c = findminWay(arr, target-3);
            }
           System.out.println(target);
         }
         return( a + b + c);
    }
    public static void main(String[] args) {

        int [] arr = {1,2,3};

        int target = 7;

         findminWay(arr,target);
       
        
        
    }
}
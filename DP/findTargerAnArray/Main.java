import java.io.*;
import java.util.*;

public class Main {

public static boolean findTarget(int [] arr,int target,int idx){
    
    if( idx == arr.length || target == 0){
        if(target == 0){
            return true;
        }
        return false;
    }
    
    
    boolean no = findTarget(arr,target,idx+1);
    boolean yes = false;
    
    if(target - arr[idx] >= 0 ){
        yes = findTarget(arr,target-arr[idx],idx+1);
        
    }
   
    
    return yes || no;
}
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int [] arr = new int[n];
        
        int target = scn.nextInt();
        
        boolean ans = findTarget(arr,target,0);
        System.out.println(ans);

    }
}
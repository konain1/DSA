

import java.io.*;
import java.util.*;

public class brokenEconomy{


public static void findceilfloor(int [] arr,int x){
    
    int ceil = -1;
    int floor = -1;
    
    int l = 0;
    int r = arr.length-1;
    
    while(l<=r){
        int mid = (l+r)/2;
        
        if(x == arr[mid]){
            floor = arr[mid];
            ceil = arr[mid];
            break;
        }else if(x>arr[mid]){
            floor = arr[mid];
            l = mid+1;
            
        }else{
            ceil = arr[mid];
            r = mid-1;
        }
    }
    System.out.println("ceil is = "+ceil);
    System.out.println("floor is = "+floor);
    
}
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    int [] arr = new int[n];
    
    for(int i =0;i<n;i++){
        arr[i] = scn.nextInt();
        
        
    }
    int d= scn.nextInt();
    
    findceilfloor(arr,d);
 }

}
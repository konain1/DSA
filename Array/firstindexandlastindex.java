
import java.io.*;
import java.util.*;

public class firstindexandlastindex{


    public static int lastindex(int [] arr,int x){
        int Lindex = -1;
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = (l + r) / 2;
            if(x == arr[mid]){
                Lindex = mid;
                l = mid + 1;
            }else if(x < arr[mid]){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return Lindex;
    }
public static int firstindex(int [] arr,int x){
    
    int Findex = -1;
    
    
    
    int l = 0;
    int r = arr.length-1;
    
    while(l<=r){
        
        int mid  = (l+r) / 2;
        
        if(x == arr[mid]){
            Findex = mid;
            r = mid-1;
            
        }else if(x>arr[mid]){
           l = mid + 1;
        }else {
            r = mid - 1;
        }

    }
   return Findex;
    
}
public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int [] arr = new int[n];
    
    
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    
    int d = scn.nextInt();
   int firstIdx =  firstindex(arr,d);
   System.out.println(firstIdx);
   int lastIdx = lastindex(arr,d);
   System.out.println(lastIdx);
    
 }

}
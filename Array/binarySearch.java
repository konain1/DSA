import java.util.Scanner;

public class binarySearch {

    public static int binaryX(int [] arr,int x){

        int start = 0;
        int end = arr.length-1;
       
        
        while(start <= end){
            int mid = (start + end )/ 2;
            
        if(x == arr[mid]){
            
            return mid;
        }else if(x>arr[mid]){
            start = mid+1;
        }else {
            end = mid-1;
        }
        
        
    }
    return -1;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter x value which you want search");
        int x = scn.nextInt();

        int [] arr = new int[] {10,20,30,40,50,60,70};

        int r = binaryX(arr,x);
        System.out.println(r);
        
    }
    
}

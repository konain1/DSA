package algo;

import java.util.Scanner;

public class binarySearch {

    public static void biranryAlgo(int [] arr , int k){
        int l = 0;
        int h = arr.length-1;

        while(l <= h){

            int mid  = (l + h )/ 2;
            if(k < arr[mid]){
                h = mid -1;
            }else if(k > arr[mid]){
                l = mid + 1;
            }else{
                System.out.println(mid);
                return;
            }

           
        }
        System.out.println("-1");
       
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        biranryAlgo(arr,k);

    }
    
}

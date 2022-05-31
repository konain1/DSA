

import java.util.Scanner;

public class arrayswapSingleVariable {
   

    public static void swapArr(int l,int [] arr){
        int n = arr.length;

        if(l<=n/2){
            int temp = arr[l];
            arr[l] =arr[n-l-1];
            arr[n-l-1] = temp;

            swapArr(l+1,arr);
        }else {
            return;
        }


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        swapArr(0,arr);

        for(int i = 0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }
    
}

import java.util.Scanner;

public class arrayswapRuc {
    public static void swap(int l,int r){

       
    }

    public static void swapArr(int l,int r,int [] arr){

        if(l<r){
            int temp = arr[l];
            arr[l] =arr[r];
            arr[r] = temp;

            swapArr(l+1,r-1,arr);
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

        swapArr(0,n-1,arr);

        for(int i = 0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }
    
}

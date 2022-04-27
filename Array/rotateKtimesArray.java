import java.util.Scanner;

public class rotateKtimesArray {

    public static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void reverse(int [] arr , int i,int j){

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        
        
    }

    public static void rotate(int [] arr , int k){

  
        int n = arr.length;
        k= k%n;
        
        if(k<0){
            k = k+n;
        }

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int k = scn.nextInt();
        int n = scn.nextInt();

        int [] arr = new int [n];

        for(int i = 0; i<arr.length;i++){

            arr[i] = scn.nextInt();
        }

        rotate(arr,k);
        display(arr);
        
    }
}
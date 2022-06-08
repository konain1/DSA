
import java.util.Scanner;
public class arrayPrint {

    public static void displayArr(int [] arr,int idx){

        int n = arr.length;

        if(idx == n){
            return;
        }

        System.out.println(arr[idx]);
        displayArr(arr, idx+1);


    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int [n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        displayArr(arr,0);
        
    }
    
}

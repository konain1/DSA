
import java.util.Scanner;
public class firstindex {
    public static void firstIdx(int [] arr,int idx,int x){


        if(idx == arr.length){
            System.out.println("-1");
            return;
        }
        if(arr[idx] == x){
            System.out.println(idx+" index no");
            return;
        }else {
            firstIdx(arr, idx+1, x);
        }

        
    }

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new  int[n];

        for(int i =0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        
        firstIdx(arr,0,x);
    }
}

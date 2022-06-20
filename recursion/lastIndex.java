
import java.util.Scanner;
public class lastIndex {

    public static int displayLastIndex(int [] arr , int idx,int x){

        if(idx <0){
            return -1;
        }
        if(arr[idx] == x)
        return idx;
        return displayLastIndex(arr, idx-1, x);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();

        }
        int len = arr.length-1;
        int x = scn.nextInt();

       int result =  displayLastIndex(arr,len,x);

       System.out.println(result);
    }
    
}

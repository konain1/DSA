
import java.util.Scanner;
public class SubsequenceofString{

    public static void getSubSeq(String []arr , int idx , String ans){
        if(idx >= arr.length){
            System.out.println(ans);
            return;
        }

        getSubSeq(arr, idx+1, ans+" "+arr[idx]); // adding
        getSubSeq(arr, idx+1, ans+"-"); // not adding
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String [] arr = {"a","b","c"};

        getSubSeq(arr,0,"");
    }
}


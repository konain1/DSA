import java.util.Scanner;
public class subsequence {

    public static void getSubSeq(int []arr , int idx , String ans){
        if(idx >= arr.length){
            System.out.println(ans);
            return;
        }

        getSubSeq(arr, idx+1, ans+" "+arr[idx]); // adding
        getSubSeq(arr, idx+1, ans+"-"); // not adding
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int [] arr ={1,2,3};

        getSubSeq(arr,0,"");
    }
}


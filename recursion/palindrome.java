import java.util.Scanner;
public class palindrome {

    public static boolean palin(int [] arr,int start , int end){

        if(start >= end){
            return true;
        }
        if(arr[start] != arr[end]){
            return false;
        }
        palin(arr,arr[start+1],arr[end-1]);
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        boolean ans = palin(arr,0,n-1);
        System.out.println(ans);
    }
}
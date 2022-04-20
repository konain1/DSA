import java.util.Scanner;
// find max and min  then max - min = span
public class spanArray{

   


public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];


        //input
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }

        //span = max - min 

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n;i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min,arr[i]);
        }
        
        

        int span = max - min;
        System.out.println(span);
}
}

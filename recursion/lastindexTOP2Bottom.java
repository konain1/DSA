import java.util.Scanner;

public class lastindexTOP2Bottom {

    public static int lastIndex2(int [] arr,int idx,int x){

        if(idx == arr.length){
            return -1;
        }

        int myAns = lastIndex2(arr,idx+1,x);

        if(myAns== -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return myAns;
            }
        }else {
            return myAns;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();

        }
        
        int x = scn.nextInt();

       int result =  lastIndex2(arr,0,x);

       System.out.println(result);
    }
    
}

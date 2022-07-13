// import java.util.Scanner;


class targetSubsequence {

    public static void findTarget(int [] arr,int idx ,int target,int sum,String ans){

        if(sum>target){
            return;
        }
        if(arr.length == idx){

            if(sum == target){
                System.out.println(ans);
                
            }
            return;
        }

        //picked 
        findTarget(arr,idx+1, target, sum+arr[idx], ans+", "+arr[idx]);
        findTarget(arr, idx+1, target, sum, ans);
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

        int target = 60;


        int [] arr = {10,20,30,40,50};

        findTarget(arr,0,target,0,"");
    }
}
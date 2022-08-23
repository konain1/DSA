package countOfsubsetDp;

public class Main {

    public static int countsub(int [] arr,int sum,int n){

        if(sum == 0){
            return 1;
        }
        if(sum !=0 && n == 0){
            return 0;
        }
        int notTake = countsub(arr, sum,n-1);
        int take = 0;
        if(sum >= arr[n-1]){
            take = countsub(arr, sum - arr[n-1], n-1);
        }
        return take + notTake;
    }
    public static void main(String[] args) {
        
        int [] arr = {2,3,5,6,8,10,7};
        int sum = 10;
        int n = arr.length;
        int ans = countsub(arr,sum,n);
        System.out.println(ans);
    }
    
}

package subsetSum;

public class recursion {

    public static boolean TrueOrFalse(int [] arr ,int n, int sum){
        if(n == 0 && sum != 0){
            return false;
        }
        if(sum == 0){
            return true;
        }

        if(sum < arr[n-1]){
           return TrueOrFalse(arr, n-1, sum );
        }else {
           return TrueOrFalse(arr, n-1, sum) || TrueOrFalse(arr, n-1, sum- arr[n-1]); 
        }
        

    }
    public static void main(String[] args) {
        int [] arr = { 2,3,7,8,10};
      
        int sum = 11;
        int n = arr.length;
        boolean ans = TrueOrFalse(arr,n,sum);
        System.out.println(ans);
    }
}

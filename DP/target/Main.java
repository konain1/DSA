package target;

public class Main {
    public static boolean findTarget(int [] arr,int n , int tar){
        if(tar == 0){
            return true;
        }
        if(tar !=0 && n == 0){
            return false;
        }
        if(tar < arr[n-1]){
            return false;
        }else {
            return findTarget(arr, n-1, tar - arr[n-1]) || findTarget(arr, n-1, tar);
        }
    }
    public static void main(String[] args) {
        
        int [] arr = {2,4,5,9,1};

        int target = 12;

        int n = arr.length;

        boolean tar = findTarget(arr,n,target);
        System.out.println(tar);
    }
}

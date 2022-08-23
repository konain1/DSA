package subsetEqualPartition;

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
    

public static boolean equalSubsetPartion(int [] arr){

    int sum = 0;
    int n = arr.length;
    for(int i = 0;i<n;i++){
        sum = sum + arr[i];
    }

    if(sum % 2 !=0){
        return false;
    }

    int target = sum / 2;

    return findTarget(arr,n,target);
}

    public static void main(String[] args) {
        int [] arr = {2,3,3,3,4};

       boolean ans = equalSubsetPartion(arr);
       System.out.println(ans);
        
    }
    
}

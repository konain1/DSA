

public class allindecies {

    public static int[] indexies(int [] arr,int idx,int x,int count){
       

        if(idx == arr.length){
            int [] ans = new int[count];
            return ans;
            
        }
        if(x == arr[idx]){
            count++;
        }

         int [] myAns = indexies(arr, idx+1, x,count);
         
         if(arr[idx] == x){

            myAns[count-1] = idx;
         }
         return myAns;
    }

    public static void main(String[] args) {


        int [] arr  = new int []{ 1,2,3,4,2,2,5,6,7,2};
        int x = 2;

      int [] ans =  indexies(arr, 0, x,0);
     
      for(int  i =0;i<ans.length;i++){
          System.out.println(ans[i]);
      }


        
    }
    
}

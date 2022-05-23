import java.util.Scanner;





// 1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
// 2. You are required to find the saddle price of the given matrix and print the saddle price. 
// 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.

public class saddlepoint {


    public static void minmaxpoint(int [][] arr){

        int n = arr.length;
        boolean flag = false;
        int idx = 0;
        int low = n-1;

        for(int i = 0; i<n;i++){
            
            for(int j = 0;j<n;j++){

                if(arr[i][j] < arr[i][low]){

                    low  = j;
                }


            }
            
            for(int k=0;k<n;k++){
                if(arr[k][low] < arr[i][low]){
                    flag = true;
                    idx = i;
                    break;
                }
            }

           

        }

        if(flag){
            System.out.println(arr[idx][low]);
        }else{
            System.out.println("not found");
        }
            

       
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [][] arr = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        minmaxpoint(arr);
        
    }
}

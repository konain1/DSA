import java.util.Scanner;

public class rotate90deg2darray {
    public static Scanner scn = new Scanner(System.in);

    public static int [][] rotate90(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int [][] brr = new int[n][m];

        for(int i = 0; i< n;i++){
            for(int j = 0; j<m;j++){
                brr[i][j] = arr[j][i];
            }
        }

        return brr;
        }
    public static void display(int [][] brr){
        int n = brr.length;
        int m = brr[0].length;


        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(brr[i][j]+"\t");
            }

            System.out.println();
    }
    }


    public static void swap(int [][] crr){
        
        

        for(int row =0; row<crr.length;row++){

            int i = 0; 
            int  j = crr.length-1;
            while(i<j){
                int temp = crr[row][j];
                crr[row][j] = crr[row][i];
                crr[row][i] = temp;
                i++;
                j--;
    
            }
        }
    }

    public static void reverse(int [][] crr){

        swap(crr);
        
        
        display(crr);
    }

    public static void main(String[] args) {

        int [][] arr  = {{1, 2,3,4}, {5,6,7,8} , {9,10,11,12}, {13,14,15,16}};

       int [][] c = rotate90(arr);
        display(c);
        System.out.println("-----------");
       reverse(c);
        
        
    }
    
}

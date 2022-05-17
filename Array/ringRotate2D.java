import java.util.Scanner;

public class ringRotate2D{
    
    public static int [] getfrom2D(int [][] arr , int s){
        int n = arr.length;
        int m = arr[0].length;



        int minr = s-1;  // 1
        int maxr = n-s;  // 3
        int minc= s-1;   // 1
        int maxc = m-s;  // 5
        
        int a = minr + maxr -1;   //1 + 3 = 4-1 =3
        int b = minc + maxc -1;   // 1 + 5 = 6-1 = 5
        int c = maxr + minr -1;    // 3 + 1  = 4-1=3
        int d = maxc + minc -1;    // 5 + 1 = 6-1= 5
        
        int size = (a+b+c+d) - 4; // 16-4 = 12
        // System.out.println(size);
        
        int [] onedi = new int[size];

        int idx = 0;

        for(int i = minr;i<=maxr;i++){
            onedi[idx] = arr[i][minc];
            idx++;
        }
        minc++;

        for(int i = minc;i<=maxc;i++){
            onedi[idx] = arr[maxr][i];
            idx++;
        }
        maxr--;

        for(int i = maxr;i>=minr;i--){
            onedi[idx] = arr[i][maxc];
            idx++;
        }maxc--;

        for(int i= maxc;i>=minc;i--){
            onedi[idx] = arr[minr][i];
            idx++;
        }
        minr++;


        return onedi;

    }

    public static void oneDto2D(int [][] arr , int [] onedi){

        int n = arr.length;
        int m = arr[0].length;

        int s = 2;

        int minr = s-1;  // 1
        int maxr = n-s;  // 3
        int minc= s-1;   // 1
        int maxc = m-s;  // 5
        
        // int a = minr + maxr -1;   //1 + 3 = 4-1 =3
        // int b = minc + maxc -1;   // 1 + 5 = 6-1 = 5
        // int c = maxr + minr -1;    // 3 + 1  = 4-1=3
        // int d = maxc + minc -1;    // 5 + 1 = 6-1= 5
        


        int idx = 0;

        for(int i = minr;i<=maxr;i++){
            arr[i][minc] = onedi[idx];
            idx++;
        }
        minc++;

        for(int i = minc;i<=maxc;i++){
            arr[maxr][i]= onedi[idx];
            idx++;
        }
        maxr--;

        for(int i = maxr;i>=minr;i--){
            arr[i][maxc] = onedi[idx] ;
            idx++;
        }maxc--;

        for(int i= maxc;i>=minc;i--){
             arr[minr][i]=onedi[idx];
            idx++;
        }
        minr++;
    }
    
    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void reverse(int [] arr,int i,int j){

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
    public static void rotate(int [] arr , int k){

  
        int n = arr.length;
        k= k%n;
        
        if(k<0){
            k = k+n;
        }

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    

    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        
        
        int [][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }




        
        
        int s =2;
        int r =3;
        
         int [] oneD = getfrom2D(arr,s);
         
        rotate(oneD,r);

        oneDto2D(arr, oneD);

        //  for(int i = 0;i<oneD.length;i++){
        //      System.out.print(oneD[i]+"\t");
        //  }
        System.out.println("---------------");
        display(arr);
    }                                                                                                                                                                                                                       
    
   

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
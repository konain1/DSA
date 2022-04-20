import java.util.Scanner;

public class barChart {
    public static void Barchart(int [] arr){

        int hieght = maximum(arr);
 


            for(int star = hieght; star>=1;star--){


                for(int j =0;j<arr.length;j++){
                    if(arr[j] >= star){
                        System.out.print("*\t");
                    }else {
                        System.out.print("\t");
                    }
                    
                    
                }
                System.out.println();
            }


            
           
      
        
    }
    public static int maximum(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
    //    System.out.println(max);
        return max;
    }
    
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int [] arr = new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i] = scn.nextInt();
    }

    Barchart(arr);
    
}

}

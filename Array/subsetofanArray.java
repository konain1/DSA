import java.util.Scanner;

public class subsetofanArray {

    public static void subset(int [] arr){

        int n = arr.length;
        int total = (int)Math.pow(2, n);
        for(int i = 0;i<total;i++){

            int temp = i;
            String str = "";

            for(int j = n-1;j>=0;j--){
                int rem = temp%2;
                temp = temp /2;
                if(rem  == 0){
                    // System.out.print("- \t");
                    str = "-\t" + str;
                }else {
                    // System.out.print(arr[j]+"\t");
                    str = arr[j] + "\t" + str;
                }
            }
            
            System.out.println(str);
        }
    }
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int [] arr = new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        subset(arr);


    }
}



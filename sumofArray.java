import java.util.*;




class sumofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("enter array lenght");

        int n = scn.nextInt();

        int [] arr  = new int[n];

        for(int i = 0;i<n;i++){

            arr[i] = scn.nextInt();
        }
        

        int sum = 0;

        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
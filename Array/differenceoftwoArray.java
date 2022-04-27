import java.util.Scanner;

public class differenceoftwoArray {


    public static void differenceArray(int[] a1,int []a2){
        
        int i = a1.length-1;
        int j = a2.length-1;

        int [] ans = new int[a2.length];

        int k = ans.length-1;
        int borrow = 0;

        while(k>=0 && i>=0 && j>=0){
            
            int diff = borrow+ ( a2[j] - a1[i] );
            // System.out.println("diff"+diff);



            if(diff<0){
                diff+=10;
                borrow = -1;
            }else{
                borrow = 0;
            }
            ans[k] = diff;
            k--;
            i--;
            j--;

        }
        ans[k] = a2[j] + borrow;



        int allzero = -1;
        
        for(int zero = 0;zero<ans.length;zero++){
            if(ans[zero] !=0){
                allzero = zero;
                break;
            }
        }
        // 123 -123 = 000 edge Case
        if(allzero == -1){
            System.out.println("0");
        }


        for(int e: ans){
            System.out.print(e);
        }
    }



    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();
        // int [] a1 = new int []  {5,2,3,9};

        // for(int i=0;i<n;i++){
        //     a1[i] = scn.nextInt();
        // }

        // int m = scn.nextInt();
        // int [] a2 = new int[]  {6,2,6,1};

        // for(int i=0;i<m;i++){
        //     a2[i] = scn.nextInt();
        // }

        // differenceArray(a1,a2);





        int n = scn.nextInt();
    
    int [] a1 = new int[n];
    
    for(int i =0;i<n;i++){
        a1[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
     int [] a2 = new int[m];
    
    for(int i =0;i<m;i++){
        a2[i] = scn.nextInt();
    }
    
    differenceArray(a1,a2);
        
    }
}

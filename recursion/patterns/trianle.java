import java.util.Scanner;

class trianle {
    public static void patterTriangle(int r , int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            patterTriangle(r, c+1);
        }else{
            System.out.println();
            patterTriangle(r-1, 0);
        }

    }
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        
        patterTriangle(4, 0);

        
    }
}
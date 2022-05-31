import java.util.Scanner;

public class printNto1 {
    
public static void ntimes(int i){
    if(i<1){
        return;
    }
    System.out.println(i);
    ntimes(i-1);
    
}


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ntimes(n);
        
    }
}

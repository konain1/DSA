import java.util.Scanner;
public class printnameNtimes {

    public static void names(int i , int n){
        if(i>n){
            return;
        }
        System.out.println("konain");
        
      
        names(i+1,n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        names(1,n);
        
    }
    
}

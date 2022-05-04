import java.util.Scanner;

public class printcount{
    public static void printcounter(int count){
        

        if(count == 4){
            return;
        }
        System.out.println(count);
        count++;

        printcounter(count);
        
    }

    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);

        int count = 0;
        printcounter(count);
        
    }
    
}

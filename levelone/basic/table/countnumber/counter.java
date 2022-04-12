

import java.util.Scanner;

public class counter {

    public static int digits(int num){
        int counter= 0;
        while(num !=0){

            num = num / 10;
            counter++;

        }
        return counter;
    }
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int total = digits(num);

        System.out.println(total);
        
    }
}

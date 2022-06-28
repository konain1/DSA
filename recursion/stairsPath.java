import java.util.*;

public class stairsPath {

    public static void stairsJump(int n , String path){

        if(n == 0){
            System.out.println(path);
            return;
        }

        if(n-1>=0){
            stairsJump(n-1,path+"1");
        }

        if(n-2>=0){
            stairsJump(n-2,path+"2");
        }
        if(n-3>=0){
            stairsJump(n-3,path+"3");
        }





    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("enter stairs number");
        int n = scn.nextInt();

        stairsJump(n,"");


    }
    
}

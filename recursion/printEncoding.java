import java.util.Scanner;

public class printEncoding {

    static  String []  keypad = {"","a","b","c","d","e","f","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public static void endcoding(String n,String ans){

        int len = n.length();

        if(len == 0){
            System.out.println(ans);
            return;

        }

        char ch = n.charAt(0);
        String ros = n.substring(1);

      
        System.out.println(ans);

        endcoding(ros, ans+ch);
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
       String n = scn.next();

        endcoding(n,"");






    }
}

import java.util.*;

public class printSubSequence {

    public static void subsequence(String s,String ans){

        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0); 
        String ros = s.substring(1);

        subsequence(ros, ans+ch);
        subsequence(ros,ans);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("please enter letters");
        String s = scn.next();

        subsequence(s, "");


    }
}

import java.util.*;

public class longestCommonPrefix {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
       String[] s = {"flower","flow","flight"};
       int len = 0;

       for(int i = 0;i<s.length;i++){
        for(int j = i+1;j<s.length-1;j++){
            if(s[i].length() < s[j].length()){
                len = s[i].length();
                System.out.println("this is the size"+len);

            }
        }
       }
    }
}
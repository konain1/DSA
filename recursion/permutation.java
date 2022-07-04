import java.util.Scanner;

public class permutation {

    public static void permu(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            String ros  = str.substring(0,i) + str.substring(i+1);
            permu(ros, ans+ch);
        }
    }
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        permu(s,"");
        
    }
}


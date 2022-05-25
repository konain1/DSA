
import java.io.*;
import java.util.*;

public class stringBuilderToggle {

	public static String toggleCase(String str){
		//write your code here
		
		StringBuilder ans = new StringBuilder();
		
		for(int i = 0;i<str.length();i++){
		    char curr = str.charAt(i);
		    
		    if(curr >= 'A' && curr <= 'Z'){
		        char lc = (char)(curr - 'A' + 'a');
		        
		        ans.append(lc);
		    }else {
		         char uc = (char)(curr - 'a' + 'A');
		         ans.append(uc);
		    }
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
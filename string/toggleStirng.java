

import java.io.*;
import java.util.*;

public class toggleStirng {
    

	public static String toggleCase(String str){
		//write your code here
		
		String ans = "";
		
		for(int i = 0;i<str.length();i++){
		    char curr = str.charAt(i);
		    
		    if(curr >= 'A' && curr <= 'Z'){
		        char lc = (char)(curr - 'A' + 'a');
		        
		        ans +=lc;
		    }else {
		         char uc = (char)(curr - 'a' + 'A');
		         ans +=uc;
		    }
		}

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
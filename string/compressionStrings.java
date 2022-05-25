

import java.io.*;
import java.util.*;

public class compressionStrings  {

	public static String compression1(String str){
		// write your code here
		
		String ans = ""+str.charAt(0);
		
		for(int i = 1;i<str.length();i++){
		   char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		    
		    if(prev != curr){
		        
		        ans+=curr;
		    }
		}

		return ans;
	}

	public static String compression2(String str){
		// write your code here
		
		String ans2 = ""+str.charAt(0);
		int count = 1;
		
		for(int i = 1;i<str.length();i++){
		    
		    char curr = str.charAt(i);
		    char prev = str.charAt(i-1);
		     
		        
		        if(curr == prev){
		            count++;
		            
		        }else {
		            if(count > 1){
		                ans2 += count;
		            }
		            ans2 += curr;
		            count = 1;
		        }
		        
		}
		if(count > 1){
		    ans2+= count;
		}

		return ans2;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
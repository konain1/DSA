

// 1. You are given a string that contains only lowercase and uppercase alphabets. 
// 2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
//    For "abecd", the answer should be "a1b3e-2c1d", as 
//    'b'-'a' = 1
//    'e'-'b' = 3
//    'c'-'e' = -2
//    'd'-'c' = 1

import java.io.*;
import java.util.*;

public class differconsecutiveStirng  {

	public static String solution(String str){
		// write your code here
		
		
		StringBuilder ans = new StringBuilder();
		
		ans.append(str.charAt(0));
		
		for(int i = 1;i<str.length();i++){
		    char curr = str.charAt(i);
		     char prev = str.charAt(i-1);
		     
		     int diff = curr - prev;
		     
		     ans.append(diff);
		     ans.append(curr);
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
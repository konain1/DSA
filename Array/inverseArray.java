
import java.io.*;
import java.util.*;

public class inverseArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    
    int [] ans = new int[a.length];
    
    for(int i = 0;i<a.length;i++){
        int val = a[i];
        ans[val] = i;
    }
    
    
    
    
    return ans;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
    }

    int[] inv = inverse(a);
    display(inv);
 }

}
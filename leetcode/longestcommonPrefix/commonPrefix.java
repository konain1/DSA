

public class commonPrefix {
   
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
       String[] s = {"flower","flow","fl","floood"};
       int len = s[0].length();
      

       for(int i = 1;i<s.length;i++){
        if(len> s[i].length()){
            len = s[i].length();
        }
       }

    // int len=s[0].length();
    // for(int i=1;i<s.length;i++){
    //   if(s[i].length()<len)  
    //       len=s[i].length();
    // }
       System.out.println(len);
      

      String result =  find(s,len,"");
      System.out.println(result);
       
    }
    public static String find(String[] s, int len,String ans) {
         
        for(int i = 0;i<len;i++){
            for(int j =0;j<s.length-1;j++){
                if(s[j].charAt(i) != s[j+1].charAt(i)){
                    return ans;
                }
                
            }
            ans = ans + s[0].charAt(i);
        }
        return ans;
    }



    
}
    



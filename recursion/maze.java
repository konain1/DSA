import java.util.*;

public class maze {
    


    // sc = source column
    // sr = source row
    // dr = destination row
    // dc = destination column

    static ArrayList <String> getmazePaths(int sr,int sc,int dr,int dc){

        if(sr == dr && sc == dc){
            //base case
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

            // jumping columns
        ArrayList<String> myAns = new ArrayList<>();
        if(sc + 1 <= dc){
            ArrayList <String> hcall = getmazePaths(sr, sc+1, dr, dc);
            for(String ele : hcall){
                myAns.add("h"+ele);
            }
        }
            //jumping rows
        if(sr + 1 <= dr){
            ArrayList <String> vcall = getmazePaths(sr+1, sc, dr, dc);
            for(String ele : vcall){
                myAns.add("v"+ele);
            }
        }



        return myAns;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter destination row and column");
        int dr  = scn.nextInt();
        int dc  = scn.nextInt();

      ArrayList <String> ans =   getmazePaths(0,0,dr-1,dc-1);
      System.out.println(ans);
        
    }
}

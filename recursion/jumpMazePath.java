import java.util.*;

public class jumpMazePath {
    public static void jumpPath(int sr,int sc,int dr,int dc,String ans){

        if(sr == dr && sc == dc){
            
            System.out.println(ans);
            return;
        }

        for(int jump = 1;jump<=dc;jump++){
            if(sc+jump <= dc){
                jumpPath(sr, sc+jump, dr, dc, ans+"h"+jump);
            }


        }

        for(int jump = 1;jump<=dr;jump++){
            if(sr+jump <= dr){
                jumpPath(sr+jump, sc, dr, dc, ans+"v"+jump);
            }

            
        }
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();

        jumpPath(0,0,dr-1,dc-1,"");
    }
    
}

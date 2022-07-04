import java.util.*;

public class maze2 {

    public static void mazePath(int sr,int sc,int dr,int dc, String path){
            if(sr == dr && sc == dc ){
                System.out.println(path);
                return;
            }

            if(sr+1 <= dr){
                mazePath(sr+1, sc, dr, dc, path+"v");
            }

            if(sc+1 <= dc){
                mazePath(sr, sc+1, dr, dc, path+"h");
            }
            if(sc+1 <= dc && sr+1 <= dr){
                mazePath(sr+1, sc+1, dr, dc, path+"d");
            }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter rows");
        int dr = scn.nextInt();

        System.out.println("enter columns");
        int dc = scn.nextInt();

        mazePath(0,0,dr-1,dc-1,"");
        
    }
}

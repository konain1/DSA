import java.util.*;

public class mazeNewMethod {

    static int [][] dir = {
        {0,1},
        {1,0},
        {1,1}
    };

    static String [] dirName = {"h","v","d"};

    public static void mazePart2(int sr,int sc, int dr,int dc,String ans){

        if(sr== dr && sc == dc){
            System.out.println(ans);
            return;
        }

        for(int row = 0;row<dir.length;row++){

            for(int col = 1;col<=Math.max(dr,dc);col++){

                int r = sr + (col * dir[row][0]);
                int c = sc + (col * dir[row][1]);

                if(r >= 0 && r <= dr && c >= 0 && c <= dc){
                    mazePart2(r, c, dr, dc, ans+dirName[row]+col);
                }
            }

            
        }


    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        mazePart2(0,0,n-1,m-1,"");
        
    }
    
}

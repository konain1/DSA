package backTracking.floodfillAlgo;


import java.util.Scanner;


class floodfill2 {

    static int [][]dir = {
        {-1,0},
        {0,-1},
        {1,0},
        {0,1}
    };
    static String [] dirName = {"t","l","d","r"};

    public static void floodfillAlgo(int [][] maze ,int sr,int sc,String ans){

        if(sr ==  maze.length-1 && sc == maze[0].length -1){
            System.out.println(ans);
            return;
        }

        if(sr < 0 || sc < 0  || sr >= maze.length|| sc >= maze[0].length || maze[sr][sc] == 1){
            return;
        }
        maze[sr][sc] = 1;

        for(int i = 0;i<dir.length;i++){
            int r = sr + dir[i][0];
            int c = sc + dir[i][1];
            floodfillAlgo(maze, r, c, ans+dirName[i]);
        }

        // floodfillAlgo(maze, sr-1, sc, ans+"t");
        // floodfillAlgo(maze, sr, sc-1, ans+"l");
        // floodfillAlgo(maze, sr+1, sc, ans+"d");
        // floodfillAlgo(maze, sr, sc+1, ans+"r");

        maze[sr][sc] = 0;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] maze = new int[n][m];

        for(int i = 0;i<maze.length;i++){
            for(int j = 0;j<maze[0].length;j++){
                maze[i][j] = scn.nextInt();
            }
            scn.close();
        }
        floodfillAlgo(maze ,0,0,"");


    }
}
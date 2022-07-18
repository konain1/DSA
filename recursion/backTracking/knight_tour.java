package backTracking;

public class knight_tour {

    public static void display(int [][] chess){

        for(int i = 0;i<chess.length;i++){
            for(int j = 0;j<chess.length;j++){
                System.out.print(chess[i][j]+ " ");
               
            }
            System.out.println();
        }

    }

    public static int [][] moves = { {-2,1}, {-1,2 },{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    public static void knightMarked(int [][] chess,int r,int c,int marking){
        //base


        if(r < 0 || r >= chess.length || c < 0 || c >= chess.length || chess[r][c] > 0){
           
            return;
        }

      

        
        if(marking == chess.length * chess.length){
            
            chess[r][c] = marking;
            display(chess);
            chess[r][c] = 0;
            return;
        }
        //marking
        chess[r][c] = marking;

        // call

        for(int i=0;i<moves.length;i++){

            int x = r + moves[i][0];
            int y = c + moves[i][1];

            knightMarked(chess, x, y, marking+1);
        }
        chess[r][c] = 0;

    }
    

    public static void main(String[] args) {
        

    int [][] chess = { { 0,0,0,0,0},
    { 0,0,0,0,0},
    { 0,0,0,0,0},
    { 0,0,0,0,0},
    { 0,0,0,0,0}
                };

    
    knightMarked(chess,0,0,1);


    }
}

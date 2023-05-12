package OOPS_4;

public class Board {
    private char p1Symbol, p2Symbol;
    private int boardsize = 3;
    private char[][] board;
    private int count;

    public final static int PLAYER_1_WINS = 1;
    public final static int PLAYER_2_WINS = 1;
    public final static int DRAW = 1;
    public final static int INCOMPLETE = 1;
    public final static int INVALID = 1;

    public Board(char p1Symbol, char p2Symbol){
        board = new char[boardsize][boardsize];
        for(int i=0;i<boardsize;i++){
            for(int j=0;j<boardsize;j++){
                board[i][j] = ' ';
            }
        }
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }
}

package OOPS_4;
import java.util.Scanner;
public class TicTacToe {
    private Player player1, player2;
    private Board board;

    public static void main(String[] args){
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        //player input
        player1 = takeInput(1);
        player2 = takeInput(2);
        while(player1.getSymbol()==player2.getSymbol()){
            System.out.println("Symbol already taken !! Please take another one !!");
            char s = sc.next().charAt(0);
            player2.setSymbol(s);
        }
        //create board
        board = new Board(player1.getSymbol(), player2.getSymbol());
        //conduct the game
        boolean player1Turn=true;
        int status = Board.INCOMPLETE;
        while(status == Board.INCOMPLETE || status==Board.INVALID){
            if(player1Turn){
                System.out.println("Player 1 - "+player1.getName()+ "'s turn");
                System.out.println("Enter x : ");
                int x = sc.nextInt();
                System.out.println("Enter y : ");
                int y = sc.nextInt();
                status = board.move(player1.getSymbol(),x,y);
                if(status!=Board.INVALID){
                    player1Turn=false;
                    board.print();
                }else{
                    System.out.println("Invalid move !! Try Again");
                }
            }else{
                System.out.println("Player 2 - "+player2.getName()+ "'s turn");
                System.out.println("Enter x : ");
                int x = sc.nextInt();
                System.out.println("Enter y : ");
                int y = sc.nextInt();
                status = board.move(player2.getSymbol(),x,y);
                if(status!=Board.INVALID){
                    player1Turn=true;
                    board.print();
                }else{
                    System.out.println("Invalid move !! Try again !!");
                }
            }
        }
        if(status==Board.PLAYER_1_WINS){
            System.out.println("Player 1 - "+player1.getName()+" wins");
        }else if(status==Board.PLAYER_2_WINS){
            System.out.println("PLayer 2 - "+player2.getName()+" wins");
        }else{
            System.out.println("Match Draw");
        }
    }
    private Player takeInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player "+num+" name :");
        String name = sc.nextLine();
        System.out.println("Enter Player "+num+" symbol :");
        char s = sc.next().charAt(0);
        Player p = new Player(name,s);
        return p;
    }

}

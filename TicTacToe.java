package OOPS_4;
import java.util.Scanner;
public class TicTacToe {
    private Player player1, player2;
    private Board board;

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

import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the game!\nPress (h) to see high schools and press (s) to start!");
        String user = scan.nextLine();
        user.toLowerCase();
        if (user.equals("h")){
            //show high score
        }
        if (user.equals("s")){
            Board.game();
            Logic.returnScore2(Board.getBoards());
        }
    }
}

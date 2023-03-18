import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        int[][] arr = {{5,3},{5,5}};
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the game!\nPress (s) to start!");
        String user = scan.nextLine();
        user.toLowerCase();
        if (user.equals("s")){
            Board.game();
            System.out.println("\nYour score is: "+Logic.returnScore2(Board.getBoards()));
        }
    }
}

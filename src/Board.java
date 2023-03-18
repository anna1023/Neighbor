import java.util.*;
import java.util.Scanner;
public class Board {
    static int[][] boards;
    public static int[] check (Scanner scan){
        int[] arr = new int[2];
        String number = scan.nextLine();
        while (number.indexOf(",")==-1){
            System.out.println("Invalid number");
            number = scan.nextLine();
        }
        int i = Integer.parseInt(number.substring(0,number.indexOf(",")));
        int x = Integer.parseInt(number.substring(number.indexOf(",")+1));
        while (i >= 5 || i < 0 || x>=5 || x<0) {
            System.out.println("Invalid number");
            number = scan.nextLine();
            i = Integer.parseInt(number.substring(0,number.indexOf(",")));
            x = Integer.parseInt(number.substring(number.indexOf(",")+1));
        }
        arr[0]=i;
        arr[1]=x;
        return arr;
    }

    public static void game () {
        Scanner scan = new Scanner(System.in);
        boards = new int[5][5];

            System.out.println("Welcome to the Game!");
            for (int[] num : boards) {
                System.out.println(Arrays.toString(num));
            }
            for (int i = 0; i < 25; i++) {
                int nums = (int) (Math.random() * 10) + 1;
                System.out.println("The number is: " + nums);
                System.out.println("Please pick a coord (i.e 2,2) :");
                int[] coords = check(scan);
                int row = coords[0];
                int col = coords[1];
                if (boards[row][col] != 0) {
                    System.out.println("Invalid move");
                    while (boards[row][col] != 0) {
                        int[] change = check(scan);
                        row = change[0];
                        col = change[1];
                    }
                }
                boards[row][col] = nums;
                for (int[] num : boards) {
                    System.out.println(Arrays.toString(num));
                }
            }
        }

        public static int[][] getBoards(){
        return boards;
        }
    }



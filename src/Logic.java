public class Logic {
        public static int returnScore2(int[][] board) {
                int score = 0;
                for (int i = 0; i<board.length;i++) {
                        for (int x = 0; x<board[0].length;x++){
                                if (x==0){
                                        if (board[i][x]==board[i][x+1]){
                                                score += board[i][x];
                                        }
                                }
                                else if (x==board[0].length-1){
                                        if (board[i][x]==board[i][x-1]){
                                                score += board[i][x];
                                        }
                                }
                                else {
                                        if (board[i][x] == board[i][x + 1]||board[i][x]==board[i][x-1]) {
                                                score += board[i][x];
                                        }
                                }
                        }
                }
                for (int i=0; i<board[0].length;i++){
                        for (int x = 0; x<board.length;x++){
                                if (x==0){
                                        if (board[i][x]==board[i][x+1]){
                                                score += board[i][x];
                                        }
                                }
                                else if (x==board[0].length-1){
                                        if (board[i][x]==board[i][x-1]){
                                                score += board[i][x];
                                        }
                                }
                                else {
                                        if (board[i][x] == board[i][x + 1]||board[i][x]==board[i][x-1]) {
                                                score += board[i][x];
                                        }
                                }
                        }
                        }
return score;
        }
}



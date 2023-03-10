public class Logic {
        public static int returnScore2(int[][] board1) {
                int score = 0;
                int check1 = 0;
                int checking = 0;
                int check3 = 0;
                int checking2 = 0;


                for (int e = 0; e < board1.length; e++) {
                        for (int w = 0; w < board1[e].length; w++) {
                                for (int q = e; q < board1.length; q++) {
                                        check1 = board1[e][w];
                                        if (board1[q][w] == check1) {
                                                checking++;
                                        }
                                        if (checking > 1) {
                                                score += check1;
                                                checking = 0;
                                        }
                                }


                                for (int o = w; o < board1[e].length; o++) {
                                        check3 = board1[e][w];
                                        if (board1[e][o] == check3) {
                                                checking2++;

                                        }
                                        if (checking2 > 1) {
                                                score += check3;
                                                checking2 = 0;
                                        }
                                }
                        }

                }
                return score;

        }
}

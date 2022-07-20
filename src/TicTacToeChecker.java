public class TicTacToeChecker {

    public static void main(String[] args) {

        int solved = isSolved2(new int[][]{{1, 1, 1}, {0, 0, 0}, {0, 0, 0}});

        System.out.println(solved);
    }
    public static int isSolved2(int[][] board) {
        int x;
        int y;

        int xd = 0;
        int yd = 0;

        int aa = 0;
        int bb = 0;

        for (int row = 0; row < board.length; row++) {
            x = 0;
            y = 0;

                for (int column = 0;column < 3; column++ ) {

                    if (board[row][column] == 1) {
                        x++;
                    }
                    if (board[row][column] == 2) {
                        y++;
                    }

                    if (row == 0) {
                        int xy = 0;
                        int yy = 0;

                        for (int i = 0; i < 3; i++) {
                            switch (board[i][column]) {
                                case 1: xy++; break;
                                case 2: yy++; break;
                            }

                            switch(board[i][2-i]) {
                                case 1: xd++; break;
                                case 2: yd++; break;
                            }

                        }

                        if (xy == 3 || xd ==3) return 1;
                        if (yy == 3 || yd ==3) return 2;

                        xd=0;
                        yd=0;
                    }

                    if(row==column) {
                        if (board[row][column] == 1) {
                            aa++;
                        }
                        if (board[row][column] == 2) {
                            bb++;
                        }
                    }

                }
                if (aa == 3 || x == 3) return 1;
                if (bb == 3 || y == 3) return 2;

        }

        for (int row = 0 ; row < board.length ; row++ )
            for( int column = 0 ; column < board.length ; column++) {

                if(board[row][column]==0){
                    return -1;
                }

            }

        return 0;
    }

}

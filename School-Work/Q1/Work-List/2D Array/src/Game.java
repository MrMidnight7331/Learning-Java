public class Game {
    private int[][] field = new int[5][5];
    private int[] pos1 = {0, 0};
    private int[] pos2 = {4, 4};

    public Game() {
        // Initialisiere das field
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                field[i][j] = 0;
            }
        }
        field[pos1[0]][pos1[1]] = 1;
        field[pos2[0]][pos2[1]] = 2;
    }

    public void left(int figur) {
        if (figur == 1) {
            if (pos1[1] > 0) {
                field[pos1[0]][pos1[1]] = 0;
                pos1[1]--;
                field[pos1[0]][pos1[1]] = 1;
            } else {
                System.out.println("Figure 1 has reached the Border.");
            }
        } else if (figur == 2) {
            if (pos2[1] > 0) {
                field[pos2[0]][pos2[1]] = 0;
                pos2[1]--;
                field[pos2[0]][pos2[1]] = 2;
            } else {
                System.out.println("Figure 2 has reached the Border.");
            }
        }
        printBoard();
    }

    public void right(int figur) {
        if (figur == 1) {
            if (pos1[1] < 4) {
                field[pos1[0]][pos1[1]] = 0;
                pos1[1]++;
                field[pos1[0]][pos1[1]] = 1;
            } else {
                System.out.println("Figure 1 has reached the Border.");
            }
        } else if (figur == 2) {
            if (pos2[1] < 4) {
                field[pos2[0]][pos2[1]] = 0;
                pos2[1]++;
                field[pos2[0]][pos2[1]] = 2;
            } else {
                System.out.println("Figure 2 has reached the Border.");
            }
        }
        printBoard();
    }

    public void up(int figur) {
        if (figur == 1) {
            if (pos1[0] > 0) {
                field[pos1[0]][pos1[1]] = 0;
                pos1[0]--;
                field[pos1[0]][pos1[1]] = 1;
            } else {
                System.out.println("Figure 1 has reached the Border.");
            }
        } else if (figur == 2) {
            if (pos2[0] > 0) {
                field[pos2[0]][pos2[1]] = 0;
                pos2[0]--;
                field[pos2[0]][pos2[1]] = 2;
            } else {
                System.out.println("Figure 2 has reached the Border.");
            }
        }
        printBoard();
    }

    public void down(int figur) {
        if (figur == 1) {
            if (pos1[0] < 4) {
                field[pos1[0]][pos1[1]] = 0;
                pos1[0]++;
                field[pos1[0]][pos1[1]] = 1;
            } else {
                System.out.println("Figure 1 has reached the Border.");
            }
        } else if (figur == 2) {
            if (pos2[0] < 4) {
                field[pos2[0]][pos2[1]] = 0;
                pos2[0]++;
                field[pos2[0]][pos2[1]] = 2;
            } else {
                System.out.println("Figure 2 has reached the Border.");
            }
        }
        printBoard();
    }

    public void printBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
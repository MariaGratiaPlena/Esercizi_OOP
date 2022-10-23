import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        int p1combo = 0;
        int p2combo = 0;
        /*checking rows...*/
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if(board[i][j].equals(player1)) p1combo++;
                if(board[i][j].equals(player2)) p2combo++;
            }
            if (p1combo == 3) return player1;
            if (p2combo == 3) return player2;
            p1combo = 0;
            p2combo = 0;
        }
        /*checking columns...*/
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                if(board[j][i].equals(player1)) p1combo++;
                if(board[j][i].equals(player2)) p2combo++;
            }
            if (p1combo == 3) return player1;
            if (p2combo == 3) return player2;
            p1combo = 0;
            p2combo = 0;
        }

        int min = Integer.min(ROWS,COLUMNS);
        /*checking first diagonal...*/
        for (int i = 0; i < min; i++) {
                if(board[i][i].equals(player1)) p1combo++;
                if(board[i][i].equals(player2)) p2combo++;
        }
        if (p1combo == 3) return player1;
        if (p2combo == 3) return player2;

        p1combo = 0;
        p2combo = 0;
        int MIN = Integer.min(ROWS,COLUMNS);
        /*checking second diagonal...*/
        for (int i = ROWS; i > 0; i--) {
            for (int j = 0; j < COLUMNS; j++) {
                if(board[i][j].equals(player1)) p1combo++;
                if(board[i][j].equals(player2)) p2combo++;
            }
            if (p1combo == 3) return player1;
            if (p2combo == 3) return player2;
            p1combo = 0;
            p2combo = 0;
        }
        return "Nessun vincitore";
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                System.out.println(game);
                if(player == player1) player = player2;
                if(player == player2) player = player1;
                System.out.println("Il vincitore è: "+game.getWinner());
            }

        } while (row < ROWS && column < COLUMNS);
    }
}
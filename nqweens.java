import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class nqweens {
    public boolean safe(int r, int c, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[r][j] == 'Q') {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == 'Q') {
                return false;
            }
        }
        int r1 = r;
        for (int c1 = c; c1 >= 0 && r1 >= 0; c1--, r1--) {
            if (board[r1][c1] == 'Q') {
                return false;
            }
        }
        r1 = r;
        for (int c1 = c; c1 < board.length && r1 >= 0; r1--, c1++) {
            if (board[r1][c1] == 'Q') {
                return false;
            }
        }
        r1 = r;
        for (int c1 = c; c1 >= 0 && r1 < board.length; r1++, c1--) {
            if (board[r1][c1] == 'Q') {
                return false;
            }
        }
        r1 = r;
        for (int c1 = c; c1 < board.length && r1 < board.length; r1++, c1++) {
            if (board[r1][c1] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (safe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveQ(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        nqweens nq = new nqweens();
        List<List<String>> result = nq.solveQ(n);

        System.out.println("All possible solutions:");
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}

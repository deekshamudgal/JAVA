import java.util.*;


public class Main {

  public static void solution(boolean[][] board, int row, boolean[] cols, boolean[] ndiag
                              , boolean[] rdiag, String asf) {
    if (row == board.length) {
      System.out.println(asf + ".");
      return;
    }

    for (int col = 0; col < board.length; col++) {
      if (!cols[col] && !ndiag[row + col] && !rdiag[row - col + board.length - 1]) {
        board[row][col] = true;
        cols[col] = true;
        ndiag[row + col] = true;
        rdiag[row - col + board.length - 1] = true;
        solution(board, row + 1, cols, ndiag, rdiag, asf + row + "-" + col + ", ");
        board[row][col] = false;
        cols[col] = false;
        ndiag[row + col] = false;
        rdiag[row - col + board.length - 1] = false;
      }
    }
  }

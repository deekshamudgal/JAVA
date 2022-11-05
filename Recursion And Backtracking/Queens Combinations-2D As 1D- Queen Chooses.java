import java.io.*;

import java.util.*;

public class Main {

  public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
    if (qpsf == tq) {
      for (int row = 0; row < chess.length; row++) {
        for (int col = 0; col < chess.length; col++) {
          System.out.print(chess[row][col] ? "q	" : "-	");
        }
        System.out.println();
      }
      System.out.println();
      return;
    }

    for (int i = lcno + 1; i < chess.length * chess.length; i++) {
      int row = i / chess.length;
      int col = i % chess.length;

      if (chess[row][col] == false) {
        chess[row][col] = true;
        queensCombinations(qpsf + 1, tq,
                           chess, row * chess.length + col);
        chess[row][col] = false;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    boolean[][] chess = new boolean[n][n];

    queensCombinations(0, n, chess, -1);
  }
}

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

  }

  public static void printKnightsTour(int[][] chess, int r, int c, int move) {

    //Code based on High Level Thinking

    chess[r][c] = move; //Fill the chess[r][c] will the move number

    //Apply recursive calls on the basis of faith
    printKnightsTour(chess, r - 2, c + 1, move + 1);
    printKnightsTour(chess, r - 1, c + 2, move + 1);
    printKnightsTour(chess, r + 1, c + 2, move + 1);
    printKnightsTour(chess, r + 2, c + 1, move + 1);
    printKnightsTour(chess, r + 2, c - 1, move + 1);
    printKnightsTour(chess, r + 1, c - 2, move + 1);
    printKnightsTour(chess, r - 1, c - 2, move + 1);
    printKnightsTour(chess, r - 2, c - 1, move + 1);

    //Follow the Backtracking principle
    chess[r][c] = 0;
  }

  public static void displayBoard(int[][] chess) {
    for (int i = 0; i < chess.length; i++) {
      for (int j = 0; j < chess[0].length; j++) {
        System.out.print(chess[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
  }
}

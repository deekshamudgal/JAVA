import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    displayArrRev(arr, 0);

  }

  public static void displayArrRev(int[] arr, int idx) {
    if (idx == arr.length) return;
    displayArrRev(arr, idx + 1);
    System.out.println(arr[idx]);
  }

}

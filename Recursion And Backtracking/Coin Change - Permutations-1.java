import java.io.*;

import java.util.*;

public class Main {

  public static void coinChange(int[] coins, int amtsf, int tamt, String asf, boolean[] used) {  //amtsf= amount so far,tamt= total amount,asf=answer so far
    if (amtsf > tamt) { //1
      return;
    } else if (amtsf == tamt) {
      System.out.println(asf + ".");
      return;
    }
    for (int i = 0; i < coins.length; i++) { //2
      if (used[i] == false) {
        used[i] = true;
        coinChange(coins, amtsf + coins[i], tamt, asf + coins[i] + "-", used); //3
        used[i] = false; //4
      }
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] coins = new int[n];
    for (int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }
    int amt = Integer.parseInt(br.readLine());
    boolean[] used = new boolean[coins.length];
    coinChange(coins, 0, amt, "", used);
  }
}

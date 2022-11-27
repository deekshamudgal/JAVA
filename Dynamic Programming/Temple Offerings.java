import java.io.*;

import java.util.*;

public class Main {

  public static int totaloffering(int[] height) {
    // write your code here
    int[] dp1 = new int[height.length];

    dp1[0] = 1;
    for (int i = 1; i < dp1.length; i++)
    {
      if (height[i] > height[i - 1])
      {
        dp1[i] = dp1[i - 1] + 1;
      }
      else
      {
        dp1[i] = 1;
      }
    }

    int[] dp2 = new int[height.length];
    dp2[dp2.length - 1] = 1;

    for (int i = dp2.length - 2; i >= 0; i--)
    {
      if (height[i] > height[i + 1])
      {
        dp2[i] = dp2[i + 1] + 1;
      }
      else
      {
        dp2[i] = 1;
      }
    }

    int ans = 0;
    for (int i = 0; i < height.length; i++)
    {
      ans = ans + Math.max(dp1[i], dp2[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int height[] = new int[n];
    for (int i = 0; i < n; i++) {
      height[i] = scn.nextInt();
    }
    scn.close();
    System.out.println(totaloffering(height));
  }

}

import java.io.*;

import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a) {

    int [] b = new int[a.length];

    for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
    {
      b[j] = a[i];
    }

    for (int i = 0; i < a.length; i++)
    {
      a[i] = b[i];
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
  }

}

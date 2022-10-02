import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();

    long ob = 1;
    long os = 1;
    for (int i = 2; i <= n; i++) {
      long nb = os;
      long ns = os + ob;

      ob = nb;
      os = ns;
    }
    int total = ob + os;
    System.out.println(total * total);
  }

}

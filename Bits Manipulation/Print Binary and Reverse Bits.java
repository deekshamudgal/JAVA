import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean flag = false;
    for (int i = 31; i >= 0; i--) {
      int mask = (1 << i);

      if (flag)
      {
        if ((n & mask) != 0)
        {
          System.out.print(1);
        }
        else
        {
          System.out.print(0);
        }
      }
      else
      {
        if ((n & mask) != 0)
        {
          flag = true;
          System.out.print(1);
        }
        else
        {

        }
      }
    }
  }

}

import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here

    int val = (((n << 3) - n) >> 3);
    System.out.print(val);

  }
}

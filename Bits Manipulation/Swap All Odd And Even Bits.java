import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //write your code here

    int om = 0x55555555;
    int em = 0xAAAAAAAA;

    int odds = (n & om);
    int even = (n & oe);

    odds <<= 1;
    even >>= 1;

    n = odds | even;

    System.out.print(n);
  }

}

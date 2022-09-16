import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = 0, st = n; // sp = spaces ; st = stars
    for (int i = 1; i <= n; i++)
    {
      System.out.println(sp + "," + st);
      sp++;
      st--;
    }
  }
}

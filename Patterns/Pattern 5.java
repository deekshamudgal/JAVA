import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sp = n / 2, st = 1; // sp = spaces ; st = stars
    for (int i = 1; i <= n; i++)
    {
      System.out.println(sp + "," + st);
      if ( i <= n / 2)
      { sp--;
        st += 2;
      }
      else
      {
        sp++;
        st -= 2;
      }
    }
  }
}

import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int st = n / 2 + 1, sp = 1; // sp = spaces ; st = stars
    for (int i = 1; i <= n; i++)
    {
      System.out.println(st + "," + sp + "," + st);
      if ( i <= n / 2)
      { sp += 2;
        st--;
      }
      else
      {
        sp -= 2;
        st++;
      }
    }
  }
}

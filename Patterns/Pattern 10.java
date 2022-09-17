import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int os = n / 2; //outer spacing = half of n
    int is = -1; //same as 0; not to print anything
    for (int i = 1; i <= n; i++)
    {
      System.out.println(os + "," + is);
      if (i <= n / 2)
      {
        os--;
        is += 2;
      }
      else
      {
        os++;
        is -= 2;
      }
    }
  }
}

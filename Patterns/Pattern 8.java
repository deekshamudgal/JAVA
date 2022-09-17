import java.util.*;

public class Main {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 1; i <= n; i++) //decides the number of rows for output printing  {
      for (int j = 1; j <= n; j++) //prints the stars in the row
      {
        if (i + j == n + 1) //when row number == column number  {
          System.out.print("*	");
        break; // break out of the loop as star is printed  }
        else //when row number != column number  System.out.print("  ");
        }
    System.out.println(); //changes the row on output console
  }
}
}

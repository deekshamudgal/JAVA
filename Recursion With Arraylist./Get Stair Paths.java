import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList< String> paths = getStairPaths(n);
    System.out.println(paths);
  }

  public static ArrayList< String> getStairPaths(int n) {
    if (n == 0) {                                      //1.1
      ArrayList< String> bres = new ArrayList< >();
      bres.add("");
      return bres;
    } else if (n < 0) {
      ArrayList< String> bres = new ArrayList< >();         //1.2
      return bres;
    }

    ArrayList< String> path1 = getStairPaths(n - 1);         //2.1
    ArrayList< String> path2 = getStairPaths(n - 2);         //2.2
    ArrayList< String> path3 = getStairPaths(n - 3);         //2.3

    ArrayList< String> paths = new ArrayList< >();            //3

    for (String path : paths1) {
      paths.add("1" + path);                               //4.1
    }
    for (String path : path2) {
      paths.add("2" + path);                               //4.2
    }
    for (String path : path3) {
      paths.add("3" + path);                               //4.3
    }
    return paths;                                           //5

  }

}

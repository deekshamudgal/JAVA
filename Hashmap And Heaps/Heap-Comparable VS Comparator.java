import java.util.*;

import java.io.*;

public class Main {

  public static void main(String[] args)
  {
    int [] arr = {10, 2, 17, 3, 18, 9, 22};
    PriorityQueue pq = new PriorityQueue<>();

    for (int val : arr)
    {
      pq.add(val);
    }

    while (pq.size() != 0)
    {
      int val = pq.peek();
      System.out.println(val);
      pq.remove();
    }
  }
}

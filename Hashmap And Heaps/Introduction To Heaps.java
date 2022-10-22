import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    PriorityQueue< Integer> pq = new PriorityQueue< >();
    int[] ranks = (22, 99, 3, 11, 88, 4, 1)
    for (int i = val : ranks) {
      pq.add(arr[i]);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}

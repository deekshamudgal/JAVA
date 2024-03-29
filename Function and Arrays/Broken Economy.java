import java.util.*;

import java.io.*;

public class Main {
  public static void main (String[]args) {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt ();
    }
  }
  int low = 0;
  int high = arr.length - 1;
  int data = scn.nextInt ();
  int ceil = Integer.MAX_VALUE;
  int floor = Integer.MIN_VALUE;
  while (low <= high) {
    int mid = (low + high) / 2;
    if (data < arr[mid]) {
      high = mid - 1;
      ceil = arr[mid];
    }
    else if (data > arr[mid]) {
      low = mid + 1;
      floor = arr[mid];
    } else {
      ceil = floor = arr[mid];
      break;
    }

  }
  System.out.println (ceil);
  System.out.println (floor);
}
}

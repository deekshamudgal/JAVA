import java.io.*;

import java.util.*;

public class Main {

  public static void solution(int[] arr) {

    int c = 0; //1
    for (int i = 0; i < arr.length; i++) { //2
      int val = arr[i];
      for (int k = i + 1; k < arr.length; k++) { //3
        val = val ^ arr[k];
        if (val == 0) { //4
          c += (k - i);
        }
      }
    }
    System.out.println(c); //5

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }


}

import java.io.*;

import java.util.*;

public static int[] mergeSort(int[] arr, int lo, int hi) { //1
  if (lo == hi) {                                                                      //2
    int[]ba = new int[1];
    ba[0] = arr[lo];
    return ba;
  }
  int mid = (lo + hi) / 2;                                                     //3
  int[] f = mergeSort(arr, lo, mid);                                 //4
  int[] s = mergeSort(arr, mid + 1, hi);                        //5
  int[] fin = mergeTwoSortedArrays(f, s);                 //6
  return fin;                                                                     //7
}

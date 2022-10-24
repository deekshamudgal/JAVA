import java.io.*;

import java.util.*;

public class Main {


  public static class HashMap< K, V> {        //1
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList< HMNode>[] buckets; // N = buckets.length

    public HashMap() {  //2
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {  //3
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

import java.io.*;

import java.util.*;

public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
  Node one = l1.head;
  Node two = l2.head;
  LinkedList res = new LinkedList();
  while (one != null && two != null) {
    if (one.data < two.data) {
      res.addLast(one.data);
      one = one.next;
    } else {
      res.addLast(two.data);
      two = two.next;
    }
  }
  while (one != null) {
    res.addLast(one.data);
    one = one.next;
  }
  while (two != null) {
    res.addLast(two.data);
    two = two.next;
  }
  return res;
}

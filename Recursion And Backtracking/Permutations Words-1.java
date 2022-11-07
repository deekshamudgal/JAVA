import java.io.*;

import java.util.*;

public class Main {

  public static void generateWords(int cs, int ts, HashMap< Character, Integer> fmap, String asf) {  //cs=current spot, ts=total spots, asf= answer so far

    if (cs > ts) { //1
      System.out.println(asf);
      return;
    }
    for (char ch : fmap.keySet()) { //2
      if (fmap.get(ch) > 0) { //3
        fmap.put(ch, fmap.get(ch) - 1);
        generateWords(cs + 1, ts, fmap, asf + ch); //4
        fmap.put(ch, fmap.get(ch) + 1); //5
      }
    }

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    HashMap< Character, Integer> fmap = new HashMap< >();
    for (char ch : str.toCharArray()) {
      if (fmap.containsKey(ch)) {
        fmap.put(ch, fmap.get(ch) + 1);
      } else {
        fmap.put(ch, 1);
      }
    }

    generateWords(1, str.length(), fmap, "");
  }

}

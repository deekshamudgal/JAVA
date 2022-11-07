import java.io.*;

import java.util.*;

public class Main {

  public static void generateWords(int cc, String str, Character[] spots, HashMap< Character, Integer> lastOccurence) { //cc=current character

    if (cc == str.length()) { //1
      for (int i = 0; i < spots.length; i++) {
        System.out.print(spots[i]);
      }
      System.out.println();
      return;
    }
    char ch = str.charAt(cc); //2
    int lo = lastOccurence.get(ch);

    for (int i = lo + 1; i < spots.length; i++) { //3
      if (spots[i] == null) {
        spots[i] = ch; //4
        lastOccurence.put(ch, i);
        generateWords(cc + 1, str, spots, lastOccurence); //5
        lastOccurence.put(ch, -1); //6
        spots[i] = null;
      }
    }

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Character[] spots = new Character[str.length()];
    HashMap< Character, Integer> lastOccurence = new HashMap< >();
    for (char ch : str.toCharArray()) {
      lastOccurence.put(ch, -1);
    }

    generateWords(0, str, spots, lastOccurence);
  }

}

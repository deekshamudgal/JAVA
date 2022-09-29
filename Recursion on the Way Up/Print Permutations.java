import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    printPermutations(str, "");

  }

  public static void printPermutations(String str, String asf) {

    if (str.length() == 0)
    {
      System.out.println(asf); //Question string is empty so print the answer now and return
      return ;
    }
    //Extracting each character at a time from the question string and appending it to answer so far
    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      String leftPart = str.substring(0, i); //Substring from 0 to i-1 (left to ch)
      String rightPart = str.substring(i + 1); //Substring from i+1 till end of String (right to ch)
      String roq = leftPart + rightPart; //Remaining string after extracting ch
      printPermutations(roq, asf + ch);
    }

  }
}

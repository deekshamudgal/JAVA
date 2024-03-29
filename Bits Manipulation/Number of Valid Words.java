public static ArrayList< Integer> findNumOfValidWords(String[] words, String[] puzzles) {
  HashMap < Integer, List< Integer>> map = new HashMap<>();

  ArrayList< Integer> res = new ArrayList<>();

  for (int i = 0; i < 26; i++) {
    map.put(i, new ArrayList<>());
  }

  for (String word : words) {
    int temp = 0;
    //make bit mask of every word
    for (char c : word.toCharArray()) {
      temp = temp | (1 << (c - 'a' ));
    } //jo jo bit on hai uske saamne word rkh diya
    for (int i = 0; i < 26; i++) {
      if ((temp & (1 << i)) != 0) {
        map.get(i).add(temp);
      }
    }
  }

  for (String p : puzzles) {
    int temp = 0;
    //make bit mask of a puzzle
    for (char c : p.toCharArray()) {
      temp = temp | (1 << (c - 'a' ));
    } //bring out the first character
    int c = p.charAt(0) - 'a' ;
    int count = 0;
    for (int key : map.get(c)) {
      if ((key & temp) == key) {
        count++;
      }
    }
    res.add(count);
  }
  return res;
}

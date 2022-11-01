public static int getMin(String str) {
  Stack st = new Stack<>();

  for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if (ch == '(' ) {
      st.push(ch);
    }
    else
    { if (st.size() == 0 || st.peek() == ')' ) {
        st.push(ch);
      }
      else if (st.peek() == '(' ) {
        st.pop();
      }
    }
  }
  return st.size();
}

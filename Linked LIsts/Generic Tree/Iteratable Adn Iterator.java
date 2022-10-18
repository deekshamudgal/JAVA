public static class GenericTree implements Iterable< Integer> {
  Node root;

  GenericTree(Node root) {
    this.root = root
  }
  public Iterator< Integer> iterator() {
    Iterator< Integer> obj = new GTPreorderIterator();
    return obj;
  }
}

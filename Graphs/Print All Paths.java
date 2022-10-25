public static void printAllPaths(ArrayList[] graph, int src, int dest,
                                 boolean[] visited, String psf) {
  if (src == dest) {
    System.out.println(psf);

    return;
  }

  visited[src] = true;
  for (Edge e : graph[src]) {
    if (!visited[e.nbr]) {
      printAllPaths(graph, e.nbr, dest, visited, psf + e.nbr);
    }
  }
  visited[src] = false;
}

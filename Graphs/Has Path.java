                              int dest, boolean[] visited) {
  if (src == dest)                   //1
    return true;


  visited[src] = true;               //2
  for (Edge e : graph[src]) {        //3
    if (!visited[e.nbr]) {          //4
      boolean nbrHasPath = hasPath(graph, e.nbr, dest, visited);  //5
      if (nbrHasPath)              //6
        return true;
    }
  }
  return false;                      //7
}

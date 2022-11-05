public static void solution(int[] arr, int vidx, int n, int k, int[] subsetSum, int ssssf, ArrayList > ans) {
  if (vidx == arr.length) {
    if (ssssf == k) {
      int isum = subsetSum[0];

      boolean flag = true;
      for (int i = 1  ; i  < subsetSum.length; i++) {
        if (subsetSum[i] == isum) {
          continue;
        } else {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        for (ArrayList< Integer> a : ans) {
          System.out.print(a + " ");
        }
        System.out.println();
      }
    }
    return;
  }

  for (int j = 0 ; j < ans.size(); j++) {
    if (ans.get(j).size() == 0) {
      ans.get(j).add(arr[vidx]);
      subsetSum[j] += arr[vidx];
      solution(arr, vidx + 1, n, k, subsetSum, ssssf + 1, ans);
      ans.get(j).remove(ans.get(j).size() - 1);
      subsetSum[j] -= arr[vidx];
      break;
    } else {
      ans.get(j).add(arr[vidx]);
      subsetSum[j] += arr[vidx];
      solution(arr, vidx + 1, n, k, subsetSum, ssssf, ans);
      ans.get(j).remove(ans.get(j).size() - 1);
      subsetSum[j] -= arr[vidx];
    }
  }
}

public static void minJumps(int []arr) {
  int dp[] = new int[arr.length];
//1
  // dp[arr.length-1] = ;
  for (int idx = arr.length - 2 ; idx >= 0 ; idx--) { //2
    int steps = arr[idx]; //3

    int min = Integer.MAX_VALUE; //4
    if (steps > 0) { //5
      for (int i = 1 ; i <= steps ; i++) { //6
        if (idx + i < arr.length) //7
          min = Math.min(min, dp[idx + i]); //8
      }
    }

    dp[idx] = min == Integer.MAX_VALUE ? min : min + 1; //9
  }
  System.out.println(dp[0]); //10
  minJumpRE(arr, dp); //11
}

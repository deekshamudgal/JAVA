public static void solution(int[] arr) {
  //initializing a variable xor to 0.
  int xor = 0;


  //for loop to operate XOR operation among all elements of the array
  for (int i = 0 ; i < arr.length; i++) {
    xor ^= arr[i];
  }

  //rightmost bit mask of the xor of all the elements of the array
  //(also the rightmost bit mask of the two unique numbers)
  int rsb = xor & ~(xor - 1);

  //initializing a variable x
  int x = 0;
  //initializing a variable y
  int y = 0;

  //for loop on the length of the array
  for (int i = 0 ; i < arr.length; i++) {
    //checking if the '&' of ith element of the array and rightmost bit mask is
    //zero or not
    if ((arr[i] & rsb) == 0) {
      //if it is zero than we include it with the result of rest of the elements
      //with the same condition therefore segregating all such elements into set 1
      x ^= arr[i];
    }
    //elst we include it with the result of set 2
    else {
      y ^= arr[i];
    }
  }
  //doing above step we get the 2 unique values in x and y

  //then to print the number in increasing order we check is x < y
  if (x < y) {
    //if x is smaller, then we first print x and then y
    System.out.println(x);
    System.out.println(y);
    //if not, then we first print y and then x
  } else {
    System.out.println(y);
    System.out.println(x);
  }
}

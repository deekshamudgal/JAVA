
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    printDecreasing(n);
  }

  public static void printDecreasing(int n) {
    //Base case
    if(n==0){
        return;
    }
    //Expectation
    System.out.println(n);
    //Faith
    printDecreasing(n-1);
  }

}
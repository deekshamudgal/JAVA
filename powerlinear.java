import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int n=sc.nextInt();
       int p=power(x,n);
       System.out.println(p);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int pwm1=power(x,n-1);
        int pwr=x*pwm1;
        return pwr;
    }

}
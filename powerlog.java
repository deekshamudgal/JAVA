import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pwr=power(x,n);
        System.out.println(pwr);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
      
            int pw1=power(x,n/2);
            int pwr=pw1*pw1;

       
        if(n%2==1){
        pwr=pwr*x;
        
        }
        return pwr;
    }

}
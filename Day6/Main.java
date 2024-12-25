
import java.util.*;


public class Main {
    public static int calculateSum(int a,int b){
        return a+b;
    }

    public static int calculateFactorial(int n){
        if(n==1)return 1;
        if(n==0)return 1;
        return n*calculateFactorial(n-1);
    }
    public static void main(String[] args){
        int a=5;
        int b=2;
        System.out.println(calculateSum(a, b));
        System.out.println(calculateFactorial(5));
    }
}

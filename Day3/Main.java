
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<9)System.out.println("x is less than 10");
        else System.out.println("x is greater than 9");

        switch (x) {
            case 1 :
                System.out.println("1");
                break;
            case 2 :
                System.out.println("2");
                break;
            default : 
                System.out.println("invalid button");
        }


        

    }
}


import java.util.*;

public class Pattern {
    public static void main(String[] args){

        // 1)Solid reactangle
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println("");
        }

        // 2)Hollow reactangle
        n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // 3) half pyramid
        n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }


        // 4) floyd triangle
        n=5;
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }


        // 5) 0/1 triangle 
        n=5;
        int f=1;
        for(int i=0;i<n;i++){
            if(i%2==0)f=1;
            for(int j=0;j<=i;j++){
                System.out.print(f+" ");
                if(f==1)f=0;
                else f=1;
            }
            System.out.println();
        }


    }
}

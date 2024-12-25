import java.util.*;


public class Main {
    public static void main(String[] args){

        System.out.println("hello world");

        for(int i=0;i<5;i++){
            System.out.println("shivam");
        }

        int j=0;
        while(j<10){
            System.out.println("while loop");
            j++;
        }

        do{
            System.out.println("dowhile loop");
            j++;
        }while(j<15);



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while(n >0){
            sum+=n;
            n--;
        }
        System.out.println(sum);


    }
}

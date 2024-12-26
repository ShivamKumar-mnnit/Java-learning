import java.util.*;

public class array {
    public static void main(String[] args){
        int arr[] = new int[5];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;

        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(val==arr[i]){
                System.out.println(i);
            }
        }

        //2D array
        int [][] temp = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }



    }    
}

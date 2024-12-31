import java.util.*;

public class arraylist {
    public static void main(String[] args){
        System.out.println("arraylist in java");

        //memory is non-contiguous
        //size is variable while in array size is fixed
        //memory is allocated in heap

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements 
        list1.add(0);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        //get elements
        int element = list1.get(1);
        System.out.println(element);

        //to add element in bwtween 
        list1.add(1,4);
        System.out.println(list1);

        //set element at an index
        list1.set(0,5);
        System.out.println(list1);

        //delete element
        list1.remove(2);
        System.out.println(list1);


        //size of arraylist
        System.out.println(list1.size());

        //sorting
        Collections.sort(list1);
        System.out.println(list1);

    }
}

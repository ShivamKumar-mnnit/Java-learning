import java.util.*;

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age =age;
    }
    void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    // java has garbage collector so we donot need to write destructors in java 
}


public class oops {
    public static void main(String[] args){
        Student s1 = new Student("shivam", 22);
        s1.printInfo();
    }
}

import java.util.*;
public class string {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println(name);

    //    concatination 
    String firstName = "shivam";
    String lastName = "kumar";
    String fullName = firstName+lastName +" is the full name";
    System.out.println(fullName.length());


    // charAt 
    
    System.out.println(fullName.charAt(1));

//compare
// we use compareTo 
// if s1>s2 return +ve value
// if s1<s2 return -ve value 
// if s1==s2 return 0

String first = "hello";
String second = "hello";
if(first.compareTo(second)==0){
    System.out.println("strings are equal");
}
else System.out.println("not equal");

if(first=="hello"){
    System.out.println("second method to compare by ==");
}


System.out.println(first.substring(0,2)); //ending index in exclusive


//Strings are immutable in java we cannot add or delete characters from string we have to declare another string 





//String builder
StringBuilder sb = new StringBuilder("tony");
sb.setCharAt(0,'s');
System.out.println(sb);
sb.insert(0,'m');
System.out.println(sb);
sb.delete(0,2); //2 is exclusive
System.out.println(sb);

sb.append("shivam");
System.out.println(sb);


//reverse a string;
StringBuilder ourstring = new StringBuilder("hello");
for(int i=0;i<ourstring.length()/2;i++){
    char front = ourstring.charAt(i);
    char last = ourstring.charAt(ourstring.length()-i-1);
    ourstring.setCharAt(i, last);
    ourstring.setCharAt(ourstring.length()-i-1, front);
}
System.out.println(ourstring);

    }
}

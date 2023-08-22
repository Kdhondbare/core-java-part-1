//String is non-primitive data type and creates new string objects which is immutable.

/*
There are two ways to create String objects
1. Using new keyword -> It creates two objects. One in heap and one in string constant pool.
   If string constant pool doesn't contain same string object.
      String name = new String("Karan");

2. Using string literal.
      String name2 = "Karan"; //"Karan" is string literal
 */

/*
String constant pool - It is part of heap memory that is created by String class when this
String class is located by the classloader, then a part heap memory is reserved for string
constant and stored into it.
 */
public class StringExample {

    public static void main(String[] args) {

        String name = new String("Karan");//this creates new object in SCP and heap both.
        System.out.println(name);

        String name2 = "Jitesh";//this creates new object in SCP.
        System.out.println(name2);

        name = name.concat("Dhondbare");//this creates new object in SCP and heap both.
        System.out.println(name);

        String pratik = new String("Pratik");
        //pratik is variable
        //"Pratik" two string objects are created, one in heap and one in other SCP
        //pratik variable points to object in heap

        pratik = pratik.concat(" Powar");
        //a new string object will be created, heap and SCP, "Pratik Powar" and
        //pratik will point to this new string object in heap

        String pratik2 = "Pratik Powar";//pratik2 points to SCP object
        System.out.println("pratik == pratik2 : " + pratik == pratik2);

        String pratik3 = "Pratik";

        String pratik4 = pratik3 + "Powar";
      //  String pratik4 = "Pratik" + "Powar";
        System.out.println("pratik2 == pratik4: " + pratik2 == pratik4);
    }
}

package _09_String;

public class _03_EqualsDifference
{
    public static void main(String[] args) {
        // .equals and == (double equal)

        /*
        In string .equals() method it is from object class equals method override it and change the definition for to
        check the context of the variable
        // object class .equals it check the reference address in memory
         */

        String str1 = "abc";
        String str2 = "abc"; // it refers the same memory address

        System.out.println(str1 == str2); // it check the reference of memory
                                // true
        System.out.println(str1.equals(str2)); //  it check the context of the given string
                                // true

        String num1 = new String("Apple");
        String num2 = new String("Apple");

        System.out.println(num1 == num2); // false
        System.out.println(num1.equals(num2)); //true

        /*
         in String buffer it have equals method it access from the object class it check memory reference
         */

        StringBuffer st1 = new StringBuffer("hello");
        StringBuffer st2 = new StringBuffer("hello");

        System.out.println(st1.equals(st2)); // false
        System.out.println(st1 == st2); // false

        // to check string context
        System.out.println(st1.toString().equals(st2.toString())); // it print true

    }
}

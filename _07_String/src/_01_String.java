import java.util.Scanner;

public class _01_String
{
    public static void main(String args[])
    {
        /*
            String is the collection of character
            -> string is final class and it is non primitive data type
            -> String is immutable due to security purpose
         */

        String name1 = "hello"; // it is string literals
        String name2 = new String("World"); //and it make the object of string object in heap memory

        System.out.println(name1);
        System.out.println(name2);


    }
}

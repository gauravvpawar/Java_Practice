import java.util.Scanner;

public class _01_String
{
    public static void main(String args[])
    {
        /*
            String is the collection of character
            -> string is final class and it is non primitive data type
            -> String is immutable due to security purpose

            # we can declare the string using 4 ways
            1 -> using string literals
            2 -> using string class
            3 -> using stringBuffer
            4 -> using stringBuilder
         */

        // 1 . String literals
        String name1 = "hello"; // it is string literals

        // 2. String class
        String name2 = new String("World"); //and it make the object of string object in heap memory

        System.out.println(name1);
        System.out.println(name2);

        // 3. StringBuffer
        StringBuffer name3 = new StringBuffer("on");
        System.out.println(name3);

        // 4. StringBuilder
        StringBuilder name4 = new StringBuilder("Earth");
        System.out.println(name4);

    }
}

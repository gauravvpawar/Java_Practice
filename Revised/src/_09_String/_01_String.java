package _09_String;

public class _01_String
{
    public static void main(String[] args) {
        // string is collection or group of character
        // String is not data type
        // string is final class in java to declare the variable
        // string is immutable due to security purpose and string pool
        // string is thread safe

        // the number of ways to declare the string
        // 1- > String literal it used to store only single value in string literal pool
        String a = "Apple";

        String aa = "Apple"; // it point to the same object has been created in string literal pool

        String b = new String("ball"); // while using the string object it always create memory in heap as well as
        // create the object in string literal pool

        //2 -> Using string buffer
        // string buffer through we can create mutable object
        StringBuffer str1 = new StringBuffer("abc");

        // 3 -> using strin builder through we can also create the mutable object in memory
        StringBuilder str2 = new StringBuilder("kfg");

    }
}

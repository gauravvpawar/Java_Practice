package _09_String;


public class _02_StringImmutability
{
    public static void main(String[] args) {
        // while create the string object we always create immutable object
        String str1 = "apple";
        String str2 = "apple";
        String str3 = "apple";

        // through the literal it all pointing towards the same object in string literal pool

        str3 = "Apple"; // it create the another object in string literal pool
        // by assign new value
    }
}

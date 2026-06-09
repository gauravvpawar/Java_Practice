package _09_String.Questions;

public class _05_StringMethods
{
    public static void main(String[] args) {
        // string is immutable so methods they do not make change on variable directly
        String name = "AllThebest";

        System.out.println(name.charAt(1)); // it return the character present at index
        System.out.println(name.length()); // it return the length of the given string
        System.out.println(name.substring(1)); // it return from index skipping string
        System.out.println(name.substring(1 , 3)); // it return the string after remove till last idx
        System.out.println(name.equals("hello")); // it check the given string is equal to word or not
        System.out.println(name.equalsIgnoreCase("allthebest")); // it check given data in any case
        System.out.println(name.toLowerCase()); // it convert into lower case
        System.out.println(name.toUpperCase()); // it return into capital case

        name += "       ";
        System.out.println(name);// name now have extra space
        System.out.println(name.trim()); //it remove extra space
        System.out.println(name.strip());

        System.out.println(name.replace('A','M'));  // it replace the character
        System.out.println(name.isBlank()); // it check given string is empty -> false
    }
}

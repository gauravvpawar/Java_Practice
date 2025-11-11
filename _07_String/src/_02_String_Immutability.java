public class _02_String_Immutability
{
    public static void main(String[] args) {
        /*
         String immutability you can reinitialise string but you cant changes make directly on string variable
         */

        String name1 = "Hello";
        String name2 = "Hello";// they all pointing towards the same object in string literal pool
        String name3 = "Hello";

        name3 = "World"; // while reinitialise the string it make new object

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}

public class _03_String_Comparison
{
    public static void main(String[] args) {
        /*
        String comparison
        you can check the two type comparison in java
        1 ->  == (double equals)
               it always check the reference of the object
        2 -> .equals method
                it check the content check only for object
         */

        String name1 = "Hello";
        String name2 = "Hello";

        System.out.println(name1 == name1); // it return true because they on same reference
        System.out.println(name1.equals(name2)); // it return true because the context inside the SLP they point on one

        String name3 = new String("India");
        String name4 = new String("India");

        System.out.println(name3 == name4); // it return false because they different address in heap
        System.out.println(name3.equals(name4)); // true
    }
}

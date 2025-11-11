public class _04_StringBuffer_And_Builder
{
    public static void main(String[] args) {
        /*
         String buffer and StringBuilder is used to create mutable type of string
         String buffer  is synchronised i.e string buffer is slow
         Stringbuilder is not synchronised i.e string builder is faster than string buffer

         you cant create a stringbuffer variable like literals you have to always use new keyword
         */

        StringBuffer name1 = new StringBuffer("Hello");
//        System.out.println(name1);

        StringBuffer name2 = new StringBuffer("Hello");

//        name1.append("World"); // it mutability direct changes make on variable
        System.out.println(name1.equals(name2)); // it take method from the object class and it check the reference of object

        System.out.println(name1 == name2);

        System.out.println(name1.toString().equals(name2.toString())); // true or false based on content

//        string builder and string buffer have  methods
        System.out.println(name1.capacity());
        System.out.println(name1.charAt(0));
        System.out.println(name1.append("k"));
        System.out.println(name1.reverse()); // that changes make it mutable
        System.out.println(name1);


//        StringBuilder name2 = new StringBuilder("Hello");

    }
}

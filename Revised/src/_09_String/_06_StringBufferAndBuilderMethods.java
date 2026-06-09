package _09_String;

public class _06_StringBufferAndBuilderMethods
{
    public static void main(String[] args) {
        // string buffer and builder methods
        // string buffer and builder is mutable the methods direct make changes on variable
        StringBuffer str = new StringBuffer("abc");
        System.out.println(str);

        str.append("DEF");// append the character in variable
        System.out.println(str);

        //str.capacity(); // it return the capacity of the variable
        System.out.println(str.capacity());

        str.reverse();// it reverse the variable
        System.out.println(str);

        str.delete(0,3);// delete the character in that range
        System.out.println(str);

    }
}

package _09_String;

public class _04_StringBufferAndStringBuilder
{
    public static void main(String[] args) {
        // string buffer and string builder
        // its creates string mutable object

        // String buffer
        // it is synchronised
        // is thread safe
        // it is slower than string builder
        StringBuffer str1 = new StringBuffer("abc");
        str1.append("def");
        str1.append("ghi");

        System.out.println(str1);

        // string builder is faster than string buffer
        // non synchronised
        // not thread safe -> it does not provide accuray
        StringBuilder str2 = new StringBuilder();

        str2.append("pqr");
        str2.append("stuv");
        System.out.println(str2);
    }
}

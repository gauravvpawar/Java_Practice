public class _05_StringMethods
{
    public static void main(String[] args) {
        // String is the collection of character
        // string is not data type
        // string is final class in java
        // string class present in java.lang
        // two ways to define string
        // String literals
      /*  String str1 = "Gaurav"; //   it store the object in string literals pool / string constant pool
        // if this same value is store it points towards old object

        String str2  = "Gaurav";

        // 2nd way is we can create string using String class
        String str3 = new String("pawan");
        // by new keyword it create the object in heap memory as well as the copy of that object in string literal pool

        // String is immutable due to security purpose
        // once we initialise string we cannot make change in that string direct
        String fruit = "orange";
        System.out.println(fruit);
        fruit.concat("mango");
        System.out.println(fruit);

        // string cannot make direct changes due to security purpose

        // String comparison
        // in string we can check context value by using .equals()

        String a = "kite";
        String b = "kite";

        System.out.println(a.equals(b)); //  it check two variable contect
        System.out.println(a == b); // it check the object reference if variable pointed towards same object reference

        String x = new String("lion");
        String y = new String("lion");

        System.out.println(x.equals(y)); //  true
        System.out.println(x  == y); //  it check have same object address false

        // we can create mutable string using stringbuffer and stringbuilder
        // String buffer
        // string buffer through we can create mutable string
        // String buffer is thread safe in that case multiple object can make change concurently

        StringBuffer alp = new StringBuffer();
        alp.append("a");
        alp.append("b");
        System.out.println(alp);

        // Stringbuilder
        // string builder through we can create a mutable string as well
        // string builder is not thread safe
        // string builder is faster than as compare to stringbuffer
        // string buffer is working good at single thread use
        StringBuilder sb = new StringBuilder();
        sb.append(sb).append("k");
        sb.append(sb).append("m");
        System.out.println(sb);

       */

        StringBuilder str = new StringBuilder();
        str.capacity();
        System.out.println(str.capacity());

        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.capacity());

        String name = "gaurav";
        System.out.println(name.length()); // return length of string
        name.concat(" pawar"); // to add the string in that variable
        System.out.println(name.charAt(1)); // a
        System.out.println(name.substring(2)); // urav
        System.out.println(name.equals("gaurav")); // check the context
        System.out.println(name.indexOf('v'));// to return the index
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase()); //  upper case

        char ch[] = name.toCharArray(); // to return the array of character

        String check = null;
        System.out.println(check.length()); // if we find the null string length it return null pointer exception
    }
}

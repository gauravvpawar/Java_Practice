public class _02_IncompatibleError
{
    public static void main(String[] args) {
        // incompatible error
        byte a = 10;
        byte b = 20;
//        byte c = a + b;  you cant perform the arithmetic operation on byte

        System.out.println(a + b); // you can perform this

        int String = 20; // it treated as the variable to the wrapper class variable
        System.out.println(String);

//        int n = "hello";
//        System.out.println(n);
    }
}

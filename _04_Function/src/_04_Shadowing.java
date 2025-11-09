public class _04_Shadowing
{
    // when you define the variable is always be a static variable for to dont nee to create object of class
    static int a = 100;
    public static void main(String[] args) {
        /*
         to understand the shadowing of the variable
         when the low that can be override by the low level scope of the variable
         the global variable can access overall of the code but the low level scope variable you can access the within
            the block only
         */

        System.out.println(a);
        int a = 10;
        System.out.println(a);

        fun();
    }

    public  static void fun()
    {
        System.out.println(a);
    }
}

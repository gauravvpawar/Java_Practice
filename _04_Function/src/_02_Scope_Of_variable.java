public class _02_Scope_Of_variable
{
    public static void main(String[] args) {
        /*
            scope of the variable it include ->
                    1 -> function scope
                    2 -> block scope
                    3 -> loop scope
         */

        // here we define the function fun variable you cant access the variable outside the other any block
        fun();
//        System.out.println(a); you cant access it
    }

    public  static  void fun()
    {
        int a = 10;
        System.out.println("Inside fun");
    }

}

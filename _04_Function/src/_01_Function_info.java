public class _01_Function_info
{
    public static void main(String[] args) {
        /*
         Function is block of code you call it whenever it is need
         function have contain return type and the function name
         e.g ->
            return_type function name() {
                //  code
            }
         */

        greeting();
        greeting(); // when you call it multiple time

        /*
          it reduce the line of code and dry (do not repeat yourself)
         */

        int a = 10 , b = 20; // when you pass the value in function is known as the argument of the function
        int ans = add(a,b);
        System.out.println(ans);
    }

    public  static int add(int x , int y) // in parameter the passing value is known as the  parameter of the function
    {
        return x + y;
    }

    public static void  greeting()
    {
        System.out.println("Hello");
    }
}

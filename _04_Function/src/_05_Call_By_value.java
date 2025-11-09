public class _05_Call_By_value
{
    public static void main(String[] args) {
        /*
             in the call by value ->
                when you pass the value in the function it cant change the original value while perform some operation on
                    it
                it pass the copy of the variable
         */


        int a = 10;
        int b = 20;

        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);

        swap(a , b); //  while pass the variable value it pass the copy of the variable

        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);

    }

    public  static void  swap(int x , int  y)
    {
        int temp = x;
        x = y;
        y = temp;
    }

}

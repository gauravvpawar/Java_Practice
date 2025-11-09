
// block scope of the variable

public class _03_Block_Scope
{
    public static void main(String[] args) {
        /*
        in the block scope variable when you declare the variable inside the block you can reinitialise it
        but you can not declare the same variable again
        when you define the variable inside the block in block that variable you can declare it again
         */


        int a = 10;
        System.out.println(a); // 10
         {
            a = 50;
            System.out.println(a); // 50
        }

        System.out.println(a); // 50


//        ---------------------------------------
        int x = 50;
        System.out.println(x);

        {
            int y = 100;
            System.out.println(y);

            int add = x + y;
            System.out.println(add);
        }

        int y = 200; // you can again declare the  variable again
    //    System.out.println(add); // that variable you cant access out of the block because of the scope of the variable
    }
}

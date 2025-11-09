// to pass the multiple number of arguments inside the parameters

import java.util.Arrays;

public class _08_Variable_Arguments
{
    public static void main(String[] args) {

        /*
         in the variable Argument you pass the multiple data but which data he have to take input it depend on the parameter
         */

        show(10 , 20 , 30);
    }

    public static void show(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}

package _04_Function;

import java.util.Arrays;

public class _07_VarArgs
{
    public static void main(String[] args) {
        //var args is used for when in the method parameter it accepts the same or multiple number of parameter
        demo(10 , 20 , 30); // n number of paramter
        multiple(11,22,"hello" , "World"); // in that case two variable is same and third one is n number type
    }

    public static  void  demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    public static void multiple(int a , int b ,String ...v)
    {
        System.out.println(a  +  b );
        System.out.println(Arrays.toString(v));
    }
}

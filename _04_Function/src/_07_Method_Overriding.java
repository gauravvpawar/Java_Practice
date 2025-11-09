public class _07_Method_Overriding
{
    public static void main(String[] args) {
        /*
            method overriding ->
            when you create function have same name but different  number of parameter it known method overridding
            it also can be the  same function name but different return  type
         */

        int a = 20;
        int b = 30;

        System.out.println(add(a , b));
        int c = 50;
        System.out.println(add(a , b , c));

        String firstName = "Gaurav ";
        String SecondName = "Pawar";

        System.out.println(add(firstName , SecondName));
    }

    public static int add(int x , int y)
    {
        return x + y;
    }

    public static int  add(int x , int  y ,int z)
    {
        return x + y + z;
    }

    public static String add(String a , String b)
    {
        return a + b; // to concat the string
    }
}

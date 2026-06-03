package _04_Function;

// in method overloading it have same method name with different number of parameter or its data type

public class _08_MethodOverloading
{
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3 , 4));

        System.out.println(add("Gaurav"));
    }

    public static String add(String name)
    {
        return "hello "+name;
    }

    public static int add(int a , int b)
    {
        return a+b;
    }

    public static int add(int a , int b , int c)
    {
        return  a + b + c;
    }

}

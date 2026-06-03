package _04_Function;

public class _01_Functions_Info
{
    public static void main(String[] args) {
        // function is a block we can call it whenever we need of it
        // function it have 2 types
        // 1 ->  User Define function
        // 2 -> Predefine function

        // function it have its own return type and also it have taking parameter

        Greet("Gaurav");
        Greet("Ganesh");

        // pre define when we access through the pre define class
        System.out.println(Math.max(1, 2));
    }

    public static void Greet(String name)
    {
        System.out.println("hello " + name);
    }
}

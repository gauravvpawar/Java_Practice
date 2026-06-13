package _10_OOPs._10_Polymorphism._01_CompileTime_Polymorphism;

// method overloading it can possible in java but while call you, you have to call from main method


public class More_Info
{
    public static void main(String[] args) {
       // More_Info.main(new String[]{"22" , "33"}); // when you call main again it goes for recursion

        // when you have call the overload constructor you have to call from main
        More_Info.main(22);
        System.out.println("done");
    }

    // you can overload main method
    public static void main(int x)
    {
        System.out.println("We are in overload method");
        More_Info.main("Gaurav");
    }

    public static void main(String arg)
    {
        System.out.println("Hello " + arg);
    }
}

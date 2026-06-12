package _10_OOPs._08_Static;

class Human
{
    // count is fixed
    static int count = 0;
    static String population = "7Billion";

    // while every time object has been create it increase count value
    Human()
    {
        count += 1;
    }
}

public class _01_Static_Variable
{
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(h1.count); // 1

        Human h2 = new Human();
        System.out.println(h2.count);// 2

        // to access the static value
        System.out.println("count : " + Human.count);
        System.out.println("population : "+ Human.population);
    }
}

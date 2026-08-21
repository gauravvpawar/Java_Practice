package _02_Lambda_Expression;

// lambda expression
// lambda expression is just used for the shortest way implementing functional interface

interface Greeting
{
    void greet(); //  lambda expression work for default method as well
}

@FunctionalInterface
interface Calculator
{
    void work(int days);
}

@FunctionalInterface
interface AdvancedCalcie
{
    int add(int a , int b);
}

public class _01_Demo
{
    public static void main(String[] args) {
        Greeting gr = () -> System.out.println("welcome");
        gr.greet();

        Calculator cal = (i) -> System.out.println("number of days : " + i);
        cal.work(4);

        // we can return value through expression
        AdvancedCalcie adCal = (int a , int b) -> a + b;
        adCal.add(3,5);
    }
}

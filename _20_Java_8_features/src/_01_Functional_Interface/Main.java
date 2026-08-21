package _01_Functional_Interface;

// Functional interface it means in interface have only one abstract methods
// we can provide specifically functional interface for those single abstract method interface
// for example we have runnable ,
@FunctionalInterface
interface Calculator
{
    // just declare the one abstract method in it
    void add(int a , int b);
}

public class Main
{
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };

        cal.add(10 , 5);
    }
}

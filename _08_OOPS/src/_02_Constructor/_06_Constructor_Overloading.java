package _02_Constructor;

class Calculator
{
    int a , b  , c , d;

    Calculator()
    {
        System.out.println("Performing  additions ");
    }
    Calculator(int a , int b)
    {
        System.out.println(a+b);
    }

    Calculator(int a , int b , int  c)
    {
        System.out.println(a + b + c);
    }

    Calculator(int a , int  b , int c , int d)
    {
        System.out.println(a + b + c + d);
    }
}

public class _06_Constructor_Overloading
{
    public static void main(String[] args) {
        /*
         Constructor overloading ->
            it means class have the constructor with different number of parameter
            and constructor it same like a method but its name is same like its class name
         */

        Calculator c1 = new Calculator(10 , 20);
        Calculator c2 = new Calculator(10 , 20 ,30);
        Calculator c3 = new Calculator(10 , 20 , 30 , 40);

        Calculator c4 = new Calculator();

    }
}

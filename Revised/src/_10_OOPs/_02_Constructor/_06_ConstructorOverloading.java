package _10_OOPs._02_Constructor;

// in constructor overloading in that
// having Constructor in class with different number of parameter

class Calculation
{
    int a, b , c , d;

    Calculation()
    {
        System.out.println("Inside default constructor");
        System.out.println("Dont have action");
    }

    Calculation(int a)
    {
        System.out.println("Parameterised constructor");
        System.out.println("Enter 1 value : " + a);
    }

    Calculation(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Addition of number : " + (a + b));
    }

    Calculation(int a , int b , int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Addition of number : " + (a + b + c));
    }
}
public class _06_ConstructorOverloading
{
    public static void main(String[] args) {
        Calculation c1 = new Calculation();

        Calculation c2 = new Calculation(10,20,30);
    }
}

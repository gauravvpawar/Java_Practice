package _10_OOPs._10_Polymorphism._01_CompileTime_Polymorphism;

// in compile time polymorphism
// it in same class have same method with different number of parameter of data type
// it called compile time polymorphism
// compile time polymorphism you can not achieve through just changing the return type of method

class Calculator
{
    // to change return type that cant work
   /* int add(int x)
    {
        return x;
    } cant
    */

    void add(int a)
    {
        System.out.println("You enter one number : " +a);
    }

    void add(int a , int b)
    {
        System.out.println("Addition of number : " + (a + b));
    }

    // change the list of data type in method
    void add(float a, int b)
    {
        System.out.println("Addition of float and int : " + (a + b));
    }


}

public class Main
{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(1);

        c1.add(2,4);

        c1.add(2.0f , 10);
    }
}

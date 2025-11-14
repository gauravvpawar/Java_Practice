package _03_Inheritance;

class Dmart
{
    int pen = 10 , Biscuit = 50 , clothes = 500;
}

class  Customer1 extends Dmart{
    void fun()
    {
        System.out.println("total :  " + (pen + Biscuit));
    }
}

class Customer2 extends Dmart
{
    void total()
    {
        System.out.println("Total : "  + (pen + Biscuit +clothes));
    }
}

public class _04_Hierarchical_Inheritance
{
    public static void main(String[] args) {
        /*
        Hierarchical inheritance have one parent class and multiple child class
         */

        Customer1 c1 = new Customer1();
        c1.fun();

        Customer2 c2 = new Customer2();
        c2.total();
    }
}

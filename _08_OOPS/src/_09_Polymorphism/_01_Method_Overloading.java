package _09_Polymorphism;

class Calcie
{
    int add(int x , int y)
    {
        return x + y;
    }

    int add(int x , int  y , int z)
    {
        return x + y + z;
    }

    double add(double x , double y)
    {
        return x + y;
    }

//    void add(int x , int y) you cant declare that again you must have different data type
    void add(double x , int  y)
    {
        System.out.println(x + y);
    }
}

public class _01_Method_Overloading
{
    public static void main(String args[])
    {
        /*
        in method overloading have contain in class same method name and different number of parameter
        it the parameter count is same must be use different type
         */

        Calcie c1 = new Calcie();
        System.out.println(c1.add(10 , 15));
        System.out.println(c1.add(10 , 20 , 30));
        System.out.println(c1.add(10.00d , 15.00d));

        c1.add(100.12d , 35);
    }
}

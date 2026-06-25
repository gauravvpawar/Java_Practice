package _15_Generics;

/*
Through generic method that method can work for different data types also
generic reduce the redundancy of code
 */

class Test
{
    public <Temp>void show(Temp t) // this method can work different data types as well
    {
        System.out.println(t);
    }
}

public class _01_Generic_Method
{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show(10);

        t1.show("Name");

        t1.show('A');

        t1.show(true);
    }
}

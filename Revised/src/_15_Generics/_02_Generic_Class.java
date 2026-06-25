package _15_Generics;

/*
Generic class define the instead of code redundancy we can provide to that class that run on different data type as
well
 */

class Demo<Temp>
{
    Temp t;

    public void setter(Temp t)
    {
        this.t = t;
    }

    public Temp getter()
    {
        return t;
    }
}

public class _02_Generic_Class
{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setter(1234);
        System.out.println(d1.getter());

        d1.setter("Elizabeth");
        System.out.println(d1.getter());
    }
}

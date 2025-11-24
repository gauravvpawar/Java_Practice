package _01_Generic_Class;

class Test<t>
{
    t obj;
    public void setvalue(t obj)
    {
        this.obj = obj;
    }

    public t returnValue()
    {
        return obj;
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        When the class is generic and you want to create a class that class have variable it depends  on at the time of
        creating object and all method is works on that data type
        that time we can use generic class
         */

        Test t1 = new Test();
        t1.setvalue("Gaurav");
        System.out.println(t1.returnValue());

        Test t2 = new Test();
        t2.setvalue(35);
        System.out.println(t2.returnValue());
    }
}

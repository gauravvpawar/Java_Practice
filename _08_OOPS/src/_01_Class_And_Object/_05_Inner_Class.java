package _01_Class_And_Object;

class Computer
{
    void work()
    {
        System.out.println("inside computer");
    }

    class Laptop
    {
        void work()
        {
            System.out.println("inside laptop");
        }
    }

    static class Desktop
    {
        void work()
        {
            System.out.println("inside desktop");
        }
    }

}


public class _05_Inner_Class
{
    public static void main(String[] args) {
        Computer c1 = new Computer();

        Computer.Laptop l1 = c1.new Laptop();
        l1.work();

        Computer.Desktop d1 = new Computer.Desktop();
        d1.work();
    }
}

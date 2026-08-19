package _04_Abstraction;

// in interface we define the method declaration and implementation provide by the child class
// we can also understand as we just provide function declaration rather than worried about method implementation

interface Computer
{
    void code();
}

class Laptop implements Computer
{
   public void code()
    {
        System.out.println("developer can code on laptop");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("developer can code on desktop");
    }
}

class Developer
{
    String name;
    public void develop(Computer computer)
    {
        computer.code();
    }
}

public class _05_Interface_Need
{
    public static void main(String[] args) {

        // we can not create the object of interface
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer emp1 = new Developer(); // we just provide the specification
        emp1.develop(laptop);

    }
}

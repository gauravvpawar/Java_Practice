package _10_OOPs._09_Final_Keyword;

// if we want to declare the final variable but we want to assign when the object is created it
// called black final variable

class Demo
{
    final  int x;

    // it initialise once when the first object is created
    Demo()
    {
        System.out.println("initialise x value");
        x = 1000;
    }

    Demo(int v)
    {
        x = v;
    }

    void printInfo()
    {
        System.out.println("x :" + x);
    }
}

public class _04_Final_More
{
    public static void main(String[] args) {
        Demo d = new Demo();
        d.printInfo();

        Demo d2 = new Demo(20000); //it initialises when the object while creating
        d2.printInfo();

    }
}

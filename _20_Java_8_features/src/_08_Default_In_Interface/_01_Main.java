package _08_Default_In_Interface;

interface Car
{
    default void work()
    {
        System.out.println("car can drive");
    }

    void show();
}

public class _01_Main
{
    public static void main(String[] args) {
        Car c = new Car() {
            public void show()
            {
                System.out.println("Blue color car");
            }
        };

        // after java 8 we can define one default method in interfaec
        c.show();
        c.work();
    }
}

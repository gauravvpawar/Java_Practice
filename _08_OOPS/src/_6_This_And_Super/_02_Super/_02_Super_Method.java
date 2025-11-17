package _6_This_And_Super._02_Super;

class Car
{
    void getIn()
    {
        System.out.println("Car ready for drive");
    }
}

class Bmw extends Car
{
    void getIn()
    {
        super.getIn(); // it first called parent method
        System.out.println("Inside show");
    }
}

public class _02_Super_Method
{
    public static void main(String[] args) {
        Bmw b1 = new Bmw();
        b1.getIn();
    }
}

package _10_OOPs._02_Constructor;

// constructor is special type of block to initialise object while its creation time
// by default constructor dont have explicit return type
// constructor can have access modifier
// e.g -> public private protected default
// constructor have same name its class name

// Types of constructor
// 1 -> default constructor
// 2 ->  Parameterised constructor
// 3 -> copy constructor
class Car
{
    int numberOfWheel;
    String carBrand;
    String engType;

    Car(int wheel , String brand , String engine )
    {
        System.out.println("Automatically called");
        numberOfWheel = wheel;
        carBrand = brand;
        engType = engine;
    }

    void printInfo()
    {
        System.out.println("Car brand : " + carBrand);
        System.out.println("number of wheel : " + numberOfWheel);
        System.out.println("Car engine : " + engType);
    }
}

public class _01_ConstructorInfo
{
    public static void main(String[] args) {

        // to initialise the object while its creating time
        Car bmw = new Car(4  , "BMW" , "V8");
        bmw.printInfo();
    }
}

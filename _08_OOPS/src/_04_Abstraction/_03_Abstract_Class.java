package _04_Abstraction;

abstract class Bank
{
    int numberaOfEmployee;

    abstract void timing();

    void  rules()
    {
        System.out.println("Saturday sunday off");
        System.out.println("Monday to friday is working day");
    }
}

class BOI extends Bank
{
    // we can assign abstract class variable values using constructor
    BOI()
    {
        numberaOfEmployee = 100;
    }

    void timing()
    {

        System.out.println("Timing : 9:30 - 5:30");
    }
}

class HDFC extends Bank
{
    void timing()
    {
        System.out.println("Timing : 7:30- 2:30");
    }
}

public class _03_Abstract_Class
{
    public static void main(String[] args) {
        /*
        Abstract contain abstract method as well as the non abstract method
        -> abstract class through we can achieve 0 - 100 % abstraction
        -when any method you provide just a declaration then that class must be abstract class
        -we cant create object of abstract class
        -abstract class there is no restriction method can be  public +  static + final
         */

//        you cant create object like
//        Bank b1 = new Bank();

//        you can by create by the  anonymous inner class
        /*
        Bank bnk = new Bank()
        {
            void timing()
            {
                System.out.println("timing: 10:30 to 7:30");
            }
        };

        bnk.timing();


         */

        Bank b1 = new BOI();
        b1.timing();
        b1.rules();

        System.out.println(b1.numberaOfEmployee);

        Bank h1 = new HDFC();
        h1.timing();
        h1.rules();


    }
}

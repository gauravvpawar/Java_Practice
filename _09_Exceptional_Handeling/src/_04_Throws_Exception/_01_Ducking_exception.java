package _04_Throws_Exception;

class Calc
{
    void Action(int x , int y) throws ArithmeticException
    {
        System.out.println(x / y);
    }
}

public class _01_Ducking_exception
{
    public static void main(String[] args) {
        /*
        by using the throws keyword we can duck the exception instead of handle that method it indicate the  method
        where it called that method
        -> by throws you can pass the multiple exceptions
         */

        Calc c1 = new Calc();
        try
        {
        c1.Action(10 , 0);
        }catch (Exception e)
        {
            System.out.println("Something went wrong .. " + e.getMessage());
        }

    }
}

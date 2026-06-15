package _11_Exception_Handeling._05_Throws_Exception;

// throws it provide if the exception occur in that block it provide indication to the caller method
// by throws keyword you can indicate the multiple exception
// it used on the outside the block

class Work
{
    void test(int a , int b) throws ArithmeticException , NullPointerException
    {
        System.out.println(a / b); //we indicate if you enter 0 it generate exception then we can provide indication for
        // caller method
    }
}

public class _01_Duck_Exception
{
    public static void main(String[] args) {
        Work w = new Work();
        try
        {
            w.test(10 , 0); //  this method can create the exception we have to handle it we can also pass to the main
            //method indication it can handle by jvm
        }catch (Exception e)
        {
            System.out.println("Exception : " +e.getMessage());
        }
    }
}

package _03_Custom_Exception;

class InsufficientBalance extends RuntimeException
{
    InsufficientBalance(String s)
    {
        super(s);
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        Custom exception is created by the  developer if he wants to create the exception on the particular he can crete
        a custom exception and can handle the exception
         */

        int BankAmount = 10000 , debitAmount = 49999;

        if(debitAmount <= BankAmount)
        {
            BankAmount = BankAmount - debitAmount;
        }else {
            // when you are creating the custom exception terminate  the program you have to handle it
            try {
                throw new InsufficientBalance("bank have less amount");
            }catch (Exception e)
            {
                System.out.println("Created Exception " + e.getMessage());
            }finally {
                System.out.println("tried custom exception");
            }
        }

        System.out.println("Visit Again !");
    }
}

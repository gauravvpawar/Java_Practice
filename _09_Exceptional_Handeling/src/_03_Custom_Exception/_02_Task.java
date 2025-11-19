package _03_Custom_Exception;

import java.util.Scanner;

class PositiveNumException extends RuntimeException
{
    PositiveNumException(String s)
    {
        super(s);
    }
}

class NegativeNumException extends RuntimeException
{
    NegativeNumException(String s)
    {
        super(s);
    }
}

public class _02_Task
{
    public static void main(String[] args) {
        /*
        Take the input from  the user enter the positive number then create the positive number exception
        if the number is negative then show  the number is negative exception

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int num = sc.nextInt();

        if(num > 0)
        {
            try
            {
            throw new PositiveNumException("You entered Positive num");
            }catch (Exception e)
            {
                System.out.println(e.getStackTrace());
            }
        }else{
            try {
            throw new NegativeNumException("You entered Negative num");
            }catch (Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }
}

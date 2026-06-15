package _11_Exception_Handeling._04_Custom_Exception;

// enter the number if the number is even the PrintEvenException or OddException

import java.util.Scanner;

class Check extends RuntimeException
{
    Check(String s)
    {
      super(s);
    }
}

public class _02_task
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            throw new Check("Even number");
        }else{
            throw new Check("Odd Number");
        }
    }
}

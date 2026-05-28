package _02_Conditions;

import java.util.Scanner;

// if condition
public class _02_If_Condition
{
    public static void main(String[] args)
    {
        // check the given number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}

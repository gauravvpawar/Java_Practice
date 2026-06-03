package _04_Function.PracticeQuestion;

import java.util.Scanner;

// write the program that check the given number is prime or not
public class _01_primeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

//        System.out.println("Given number is prime : "+ checkPrime(num));
        System.out.println("Given number is prime : " + PrimeOrNot(num));
    }

    public static boolean checkPrime(int num)
    {
        if(num == 1 )
        {
            return false;
        }
        for(int i = 2;i<num;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    // 2nd way
    public static boolean PrimeOrNot(int num)
    {
        int i = 2;
        while (i * i <= num)
        {
            if(num % i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}

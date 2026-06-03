package _04_Function.PracticeQuestion;

import java.util.Scanner;

// find the prime number between range
public class _13_PrimeNumberBetweenRange
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range : ");
        int start = sc.nextInt();

        System.out.println("Enter the end range  : ");
        int end = sc.nextInt();

        findPrime(start,end);
    }

    public static void findPrime(int a,int b)
    {
        int i = a;
        while (i <= b)
        {
            if(checkPrime(i))
            {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static boolean checkPrime(int num)
    {
        if(num == 1)
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
}

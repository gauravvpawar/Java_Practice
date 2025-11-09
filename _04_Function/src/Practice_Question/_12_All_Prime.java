package Practice_Question;

//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class _12_All_Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range : ");
        int a = sc.nextInt();
        System.out.println("Enter the end rage : ");
        int b = sc.nextInt();

        find_Prime(a , b);
    }

    public static void find_Prime(int start , int end)
    {
        if(start < 2 && end <2)
        {
            System.out.println("1 is not in prime number it is composite number");
        }

        for(int i = start;i<end;i++)
        {
            if(isCheck(i))
            {
                System.out.print(i  +" ");
            }
        }
    }

    public static boolean isCheck(int num)
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

        return num * num > i;
    }
}

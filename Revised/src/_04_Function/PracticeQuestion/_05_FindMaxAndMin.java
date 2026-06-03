package _04_Function.PracticeQuestion;

import java.util.Scanner;

// take input of three number and print the Maximum one and Minimum one
public class _05_FindMaxAndMin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third Number : ");
        int num3 = sc.nextInt();

        System.out.println("The Max one Of three : " + findMax(num1 , num2 , num3));
        System.out.println("The Min one of three : " + findMin(num1, num2, num3));
    }

    public static int findMax(int a, int b , int c)
    {
        int max = a;

        if(b > max)
        {
            max =  b;
        }

        if(c > max){
            max =  c;
        }
        return max;
    }

    public static int findMin(int a,int b , int c)
    {
        int min = a;
        if(min > b)
        {
            min = b;
        }

        if(min > c)
        {
            min = c;
        }

        return min;
    }
}

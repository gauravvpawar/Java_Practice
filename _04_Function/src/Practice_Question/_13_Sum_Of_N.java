package Practice_Question;

// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class _13_Sum_Of_N
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Sum of n number : " + find_N_Sum(num));
        System.out.println("Sum of n number step 2 : " + another_Way(num));
    }

//    efficient way to find sum :
    public static int another_Way(int num)
    {
        return num * (num + 1) /2;
    }

    public static int find_N_Sum(int num)
    {
        int sum = 0;
        for(int i =1;i<=num;i++)
        {
            sum += i;
        }
        return sum;
    }
}

package Questions;

import java.util.Scanner;

public class _05_Fibonacci_Series
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");
        for(int i = 1;i<n-1;i++)
        {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}

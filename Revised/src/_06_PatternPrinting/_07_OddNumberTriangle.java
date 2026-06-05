package _06_PatternPrinting;

import java.util.Scanner;

// print the odd number triangle
/*
    1
    1 3
    1 3 5
    1 3 5 7
 */
public class _07_OddNumberTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            int count = 1;
            for(int j = 1;j<=i;j++)
            {
                System.out.print(count);
                count += 2;
            }
            System.out.println();
        }
    }
}

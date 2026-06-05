package _06_PatternPrinting;

import java.util.Scanner;

// print the floyd triangle pattern
/*
    assume n = 4;
    1
    2 3
    4 5 6
    7 8 9 10
 */
public class _15_FloydTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count = 1;
        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

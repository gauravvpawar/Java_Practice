package _06_PatternPrinting;

import java.util.Scanner;

// number triangle
/*
    1
    1 2
    1 2 3
    1 2 3 4
 */
public class _13_NumberTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

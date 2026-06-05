package _06_PatternPrinting;

import java.util.Scanner;

// print alphabetic triangle
/*
    A
    AB
    ABC
    ABCD
 */
public class _08_AlphabeticTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 0;j<i;j++)
            {
                char ch = 'A';
                System.out.print((char)(ch+j) + " ");
            }
            System.out.println();
        }
    }
}

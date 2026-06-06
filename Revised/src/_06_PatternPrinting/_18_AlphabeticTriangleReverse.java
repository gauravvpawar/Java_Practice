package _06_PatternPrinting;

import java.util.Scanner;

// Print the alphabetic triangle reverse
/*
    if n =4
       A
      AB
     ABC
    ABCD
 */
public class _18_AlphabeticTriangleReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++)
        {
            // first print the spaces
            for(int j = 0;j<num - i - 1;j++)
            {
                System.out.print(" ");
            }

            // print the char
            char ch ='A';
            for(int k = 0;k<=i;k++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

package _06_PatternPrinting;

import java.util.Scanner;

// print the alphabetic Pyramid
// e.g
/*
       A
      ABC
     ABCDE
    ABCDEF
 */
public class _21_AlphabeticPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            // for spaces
            for(int j = 1;j<=num - i;j++)
            {
                System.out.print(" ");
            }

            // to print the character
            char ch = 'A';
            for(int k = 1;k<=2* i-1;k++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

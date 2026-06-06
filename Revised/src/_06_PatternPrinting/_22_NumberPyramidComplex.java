package _06_PatternPrinting;

// number pyramid complex problem
/*
    if n = 4
       1
      121
     12321
    1234321
 */

import java.util.Scanner;

public class _22_NumberPyramidComplex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            // for spaces
            for(int k = 1;k<=num - i;k++)
            {
                System.out.print(" ");
            }

            // to print number
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }

            // to print the return number
            for(int l = i -1 ;l>0;l--)
            {
                System.out.print(l);
            }

            System.out.println();
        }

    }
}

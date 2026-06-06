package _06_PatternPrinting;

// print the star triangle in reverse
/*
Print if n = 4
       *
      **
     ***
    ****
 */

import java.util.Scanner;

public class _16_StarTriangleReverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++)
        {
            // first we print spaces
            for(int j = 0;j<num - i - 1;j++)
            {
                System.out.print(" ");
            }

            // then we print for *
            for(int k = 0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

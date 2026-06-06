package _06_PatternPrinting;

import java.util.Scanner;

// printing the numeric pyramid
//
/*
    if user enter n = 4;
       1
      123
     12345
    1234567
 */
public class _20_NumberPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            // to print the space
            for(int j = 1;j<=num-i;j++)
            {
                System.out.print(" ");
            }

            // to print the number
            for(int k = 1;k<= 2 *i -1;k++)
            {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

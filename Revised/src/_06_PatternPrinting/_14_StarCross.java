package _06_PatternPrinting;

import java.util.Scanner;

// print the star cross pattern
/*
    if n = 5 and n is always odd
    *        *
      *    *
        *
      *   *
    *        *

 */
public class _14_StarCross
{
    public static void main(String[] args) {
     // input n is always odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=num;j++)
            {
                if( (i == j ) || (i + j == (num + 1) ))
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

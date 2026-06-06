package _06_PatternPrinting;

import java.util.Scanner;

// print the alphabetic pyramid in complex
// if n = 4
/*
       A
      ABA
     ABCBA
    ABCDCBA
 */
public class _23_AlphabeticPyramidComplex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=num-i;j++)
            {
                System.out.print(" ");
            }

            // to print character
            char ch = 'A';
            for(int k = 1;k<=i;k++)
            {
                System.out.print(ch);
                ch++;// we have to reverse from this
            }

            ch -= 2; //i.e decrement by 2
            // to character in rev
            for(int l = i-1;l>0;l--)
            {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}

package _06_PatternPrinting;

// printing the pyramid complex pattern
/*
    if n is always odd
    if n = 5;
      *
     ***
    *****
     ***
      *
 */

import java.util.Scanner;

public class _24_PyramidComplex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int nSp = num/2;
        int ml = (num / 2) + 1;
        int nSt = 1;

        for(int i = 1;i<=num;i++)
        {
            // for the space
            for(int j = 1;j<=nSp;j++)
            {
                System.out.print(" ");
            }

            // for the print the spaces
            for(int k = 1;k<=nSt;k++)
            {
                System.out.print("*");
            }

            if(i < ml)
            {
                nSp--;
                nSt += 2;
            }else{
                nSp++;
                nSt -= 2;
            }

            System.out.println();
        }
    }
}

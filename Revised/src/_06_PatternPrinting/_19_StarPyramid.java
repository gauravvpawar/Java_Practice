package _06_PatternPrinting;

import java.util.Scanner;

// print the star pyramid pattern
/*
    it always print if input n = 4 it goes till 2*n-1 it mean 7
       *
      ***
     *****
    *******
 */
public class _19_StarPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            // it prints spaces
            for(int j = 1;j<= num -i;j++)
            {
                System.out.print(" ");
            }

            //for *
            for(int j = 1;j<=2 * i -1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

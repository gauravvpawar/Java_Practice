package _06_PatternPrinting;

import java.util.Scanner;

// print the rhombus pattern
/*
    if n = 4
       ****
      ****
     ****
    ****
 */
public class _17_Rhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++)
        {
            // print first spaces
            for(int j = 0;j<num-i-1;j++)
            {
                System.out.print(" ");
            }

            // print the stars
            for(int k = 0;k<num;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package _06_PatternPrinting;

import java.util.Scanner;

// print the solid rectangle
/*
    *****
    *****
    *****
 */
public class _02_SolidRectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = sc.nextInt();

        System.out.println("Enter the col size : ");
        int col = sc.nextInt();

        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

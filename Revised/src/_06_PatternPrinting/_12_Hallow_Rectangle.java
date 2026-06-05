package _06_PatternPrinting;

import java.util.Scanner;

// print the hallow rectangle pattern
// if row = 4 and col = 5
/*
    *****
    *   *
    *   *
    *****
 */
public class _12_Hallow_Rectangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int row = sc.nextInt();

        System.out.println("Enter the col size : ");
        int col = sc.nextInt();

        for(int i = 1;i<=row;i++)
        {
            for(int j = 1;j<=col;j++)
            {
                if(i == 1 || j == 1 || i == row ||j == col)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

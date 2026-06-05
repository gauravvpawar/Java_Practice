package _06_PatternPrinting;

import java.util.Scanner;

/*
    print the solid square
    *****
    *****
    *****
    *****
    *****
 */
public class _01_SolidSquare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n = sc.nextInt();

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package _06_PatternPrinting;

import java.util.Scanner;

// print the number square
/*
    1234
    1234
    1234
    1234
 */
public class _03_NumberSquare
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=num;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

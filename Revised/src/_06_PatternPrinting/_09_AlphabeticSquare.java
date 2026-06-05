package _06_PatternPrinting;

import java.util.Scanner;

// print the alphabetic square
/* if n = 4
    ABCD
    ABCD
    ABCD
    ABCD
 */
public class _09_AlphabeticSquare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            char ch = 'A';
            for (int j = 1;j<=num;j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

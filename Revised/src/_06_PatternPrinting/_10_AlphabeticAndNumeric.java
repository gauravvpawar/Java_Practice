package _06_PatternPrinting;

import java.util.Scanner;

// print the pattern that have alphabetic when the i is even
/*
    1
    A B
    1 2 3
    A B C D
    1 2 3 4 5
 */
public class _10_AlphabeticAndNumeric
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            char ch = 'A';
            for(int j = 1;j<=i;j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch + " ");
                    ch++;
                }else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

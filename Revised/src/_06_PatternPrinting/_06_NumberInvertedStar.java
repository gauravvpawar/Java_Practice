package _06_PatternPrinting;

import java.util.Scanner;

// number inverted star
/*
    1234
    123
    12
    1
 */
public class _06_NumberInvertedStar
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=num-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

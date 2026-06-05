package _06_PatternPrinting;

import java.util.Scanner;

// star inverted pattern
/*
    ****
    ***
    **
    *

 */
public class _05_StarInverted
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        /*
        it runs n =4
        for i = 1 then j = 0 to j<4 it print 4 stars
        if i = 2 then j = 1 to j < 3 it print 3 stars
         */
        for(int i = 0;i<num;i++)
        {
            for(int j =0;j<num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

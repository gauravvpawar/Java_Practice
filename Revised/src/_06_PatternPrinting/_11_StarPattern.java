package _06_PatternPrinting;

import java.util.Scanner;

public class _11_StarPattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 0;i<num;i++)
        {
            for(int j = 0;j<num;j++)
            {
                if((num / 2) == i || (num / 2) == j)
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

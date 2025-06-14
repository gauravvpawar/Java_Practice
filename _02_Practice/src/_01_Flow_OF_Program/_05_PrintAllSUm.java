package _01_Flow_OF_Program;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class _05_PrintAllSUm
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check;
        int sum = 0;
        do{
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            sum = sum  + num;
            System.out.println("Enter the 1 or x for print the sum : ");
            check = sc.next();
        }while (check.equals("1"));


        System.out.println("Bye Bye : ");
        System.out.println("Sum : " + sum);
    }
}

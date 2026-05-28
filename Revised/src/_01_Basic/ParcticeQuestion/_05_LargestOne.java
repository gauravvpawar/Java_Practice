package _01_Basic.ParcticeQuestion;


import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class _05_LargestOne
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("Num 1 is greater");
        }else{
            System.out.println("Num 2 is greater");
        }
    }
}

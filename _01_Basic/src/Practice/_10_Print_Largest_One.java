package Practice;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class _10_Print_Largest_One
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println("first number is greater one");
        }else{
            System.out.println("Second number is greater one");
        }
    }
}

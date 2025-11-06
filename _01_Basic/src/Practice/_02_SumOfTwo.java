package Practice;

import java.util.Scanner;

public class _02_SumOfTwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("Addition of two number : "+ c);

    }
}

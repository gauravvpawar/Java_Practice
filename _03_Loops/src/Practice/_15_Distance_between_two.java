package Practice;

import java.util.Scanner;

public class _15_Distance_between_two
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Distance between two points : " + (b - a));
    }
}

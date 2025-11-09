package Practice;

import java.util.Scanner;

public class _16_Power_Find
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int a = sc.nextInt();
        System.out.println("Enter the power number : ");
        int b = sc.nextInt();
        int power = 1;
        for(int i = 1;i<=b;i++)
        {
            power = power * a;
        }

        System.out.println("Power of "+ a + " to " + b + " : " + power);
    }
}

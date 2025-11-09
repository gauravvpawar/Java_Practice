package Practice_Question;

//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class _05_Product_Of_num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Product of two num : " + find_Product(a , b));
    }

    public static int find_Product(int x , int y)
    {
        return x * y;
    }
}

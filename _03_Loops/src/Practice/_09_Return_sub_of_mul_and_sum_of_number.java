package Practice;

// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

import java.util.Scanner;

public class _09_Return_sub_of_mul_and_sum_of_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int mul = 1;
        int add = 0;
        while(num > 0)
        {
            mul *= num% 10;
            add += num % 10;

            num /= 10;
        }

        System.out.println("Difference : " + (mul -add));
    }
}

package work;

import java.util.Scanner;

public class _03_Reverse_Integer
{
    public static void main(String[] args) {
        // reverse the given integer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int rev = 0;
        while(num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        System.out.println("rev : " + rev);
    }
}

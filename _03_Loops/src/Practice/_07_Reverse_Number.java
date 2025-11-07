package Practice;

import java.util.Scanner;

public class _07_Reverse_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int ans = 0;

        while(temp > 0)
        {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp /= 10;
        }

        System.out.println("Reverse Number : " + ans);
    }
}

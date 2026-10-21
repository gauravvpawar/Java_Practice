package Questions;

import java.util.Scanner;

public class _24_anagram_number
{
    public static void main(String[] args) {
        // find the given number is armstrong or not
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int digitCount = digitCount(temp);
        int ans = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            int pow = 1;
            for(int i = 1;i<=digitCount;i++)
            {
                pow = pow * rem;
            }
            ans = ans + pow;
            System.out.println(ans);
            temp /= 10;
        }

        System.out.println("Given number is anagram : " + (num == ans));
    }

    public static int digitCount(int num)
    {
        int count = 0;
        while (num > 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
}

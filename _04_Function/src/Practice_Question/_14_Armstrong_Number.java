package Practice_Question;

import java.util.Scanner;
// take input number from user and check the given number is armstrong number or not
// 153 =  1 * 1 * 1 + 5 * 5 * 5 + 3* 3 * 3

public class _14_Armstrong_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int countDigit = countDigit(num);
        int ans = 0;

        while (temp > 0)
        {
            int rem = temp % 10;
            int pow = 1;
            for(int i = 1;i<=countDigit;i++)
            {
                pow = pow * rem;
            }

            ans += pow;

            temp /= 10;
        }

        if(ans == num)
        {
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not armstrong number");
        }
    }

    public static int countDigit(int num)
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

package Task;

import java.util.Scanner;

public class _09_ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int ans = 0;
        while (temp > 0)
        {
            int rem = temp % 10;
            ans = ans + (rem * rem * rem);
            temp /= 10;
        }

        if(num == ans)
        {
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not armstrong number ");
        }
    }
}

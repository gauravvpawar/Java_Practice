package Task;

import java.util.Scanner;

public class _10_TargetNumOccur
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        int count = 0;
        while(num > 0)
        {
            int rem = num % 10;
            if(rem == target)
            {
                count++;
            }

            num /= 10;
        }

        System.out.println("Count of target in digit : " + count);
    }
}

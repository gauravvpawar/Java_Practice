package Practice;

import java.util.Scanner;

public class _19_Perfect_Number
{
    public static void main(String[] args) {
        // Perfect number
        // 1 + 2 + 4 + 7  + 14 == 28
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 1;i<=num/2;i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }

        if(sum == num)
        {
            System.out.println("Given number is perfect number");
        }else{
            System.out.println("Given number is not perfect number");
        }

    }
}

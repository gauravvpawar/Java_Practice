package _04_Function.PracticeQuestion;

import java.util.Scanner;

// Enter the number that return the factorial of the number
public class _10_FindFactorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Find Factorial : " + findFactorial(num));
    }

    public static int findFactorial(int num)
    {
        int ans = 1;

        for(int i = 2;i<=num;i++)
        {
            ans = ans * i;
        }
        return ans;
    }

}

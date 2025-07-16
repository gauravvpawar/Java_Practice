package Task;

import java.util.Scanner;

public class _07_FibonnacciSeriesTillN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        System.out.print(firstNum + " " + secondNum + " ");
        for(int i = 1;i<=n-2;i++)
        {
            int thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            System.out.print(thirdNum + " ");
        }
    }
}

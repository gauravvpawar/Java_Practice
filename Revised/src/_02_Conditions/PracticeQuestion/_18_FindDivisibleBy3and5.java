package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _18_FindDivisibleBy3and5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // it checks both condition is true
        if(num % 3 == 0 && num % 5 == 0)
        {
            System.out.println("Number is divisible by 3 and 5");
        }else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}

package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// Find the given number is divisible by 3 or 5
public class _19_FindDivisibleBy3Or5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        // it checks one condition is true if it is then execute block
        if(num % 3 == 0 || num % 5 == 0)
        {
            System.out.println("Number is divisible by 3 Or 5");
        }else{
            System.out.println("Number is not divisible by 3 or 5");
        }
    }
}

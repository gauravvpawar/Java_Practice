package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// check the given number is
// positive
// negative
// or zero
public class _03_NumberCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Given number is positive");
        }else if(num < 0)
        {
            System.out.println("Given number is negative");
        }else{
            System.out.println("Zero is given");
        }
    }
}

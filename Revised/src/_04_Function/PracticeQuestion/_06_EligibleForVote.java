package _04_Function.PracticeQuestion;

import java.util.Scanner;

// check the given age is valid for vote
public class _06_EligibleForVote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age : ");
        int age = sc.nextInt();
        System.out.println("Your age : " + checkEligibility(age));
    }

    public static String checkEligibility(int num)
    {
        if(num >= 18)
        {
            return "Eligible for vote";
        }

        return "Not Eligible for vote";
    }
}

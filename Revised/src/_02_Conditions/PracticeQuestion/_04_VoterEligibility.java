package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _04_VoterEligibility
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user age : ");
        int age = sc.nextInt();

        if(age >= 18)
        {
            System.out.println("User is validate for vote");
        }else{
            System.out.println("User is not validate for vote");
        }
    }
}

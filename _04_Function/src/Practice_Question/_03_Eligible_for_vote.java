package Practice_Question;

// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class _03_Eligible_for_vote
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        System.out.println(check_Age(age));
    }

    public static String check_Age(int age)
    {

        return age >= 18 ? "User is able for driving" : "User is not able for driving";
    }
}

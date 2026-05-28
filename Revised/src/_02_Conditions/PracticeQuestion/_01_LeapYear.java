package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// check the given year Leap year or not
// it condition as
// It is divisible by 4 and
// not divisible by 100 except
// it divisible by 400
public class _01_LeapYear
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0) )
        {
            System.out.println("Leap year " + year);
        }else{
            System.out.println("Not Leap year " + year);
        }
    }
}

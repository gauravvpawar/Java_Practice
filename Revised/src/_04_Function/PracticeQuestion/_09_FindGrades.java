package _04_Function.PracticeQuestion;

import java.util.Scanner;

public class _09_FindGrades
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks : ");
        int marks = sc.nextInt();

        System.out.println("Your Grade : "+ findGrade(marks));
    }

    public static String findGrade(int marks)
    {
        if(marks>90 && marks <= 100)
        {
            return "AA";
        }else if(marks > 80 && marks <= 90)
        {
            return "AB";
        }else if(marks > 70 && marks <= 80)
        {
            return "BB";
        }else if(marks > 60 && marks <=  70)
        {
            return "BC";
        }else if(marks > 50 && marks <= 60)
        {
            return "CD";
        }else if(marks > 40 && marks <= 50)
        {
            return "DD";
        }

        return "Fail";
    }
}

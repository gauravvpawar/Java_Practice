package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _08_SalaryIncrement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();

        int increment = 0;
        if(salary > 50000)
        {
            increment = salary * 10/100;
        }else{
            increment = salary * 5/100;
        }

        System.out.println("Salary : " + (salary + increment));
    }
}

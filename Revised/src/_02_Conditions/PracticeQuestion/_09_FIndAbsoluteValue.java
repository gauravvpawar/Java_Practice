package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _09_FIndAbsoluteValue
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num < 0 )
        {
            num = num * -1;
        }

        System.out.println("number : " + num );
    }
}

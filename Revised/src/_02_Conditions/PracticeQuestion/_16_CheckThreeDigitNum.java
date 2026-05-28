package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// find the given number three digit or not
public class _16_CheckThreeDigitNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num >99 && num <1000)
        {
            System.out.println("Given number you enter is three digit");
        }else{
            System.out.println("Given number you entered is not three digit");
        }
    }
}

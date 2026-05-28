package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// find the given number user entered is two num or not
public class _17_TwoDigitNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        if(num > 9 &&  num<100)
        {
            System.out.println("given number is two digit");
        }else{
            System.out.println("Given number is not two digit");
        }
    }
}

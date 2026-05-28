package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// check the give number is even or Odd
public class _02_EvenOdd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is Odd");
        }
    }
}

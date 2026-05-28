package _02_Conditions;

import java.util.Scanner;

// check the given number is divisible by 3 as well as 5 or not
public class _04_NestedIfElse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num % 3 == 0)
        {
            if(num % 5 == 0)
            {
                System.out.println("Given number is divisible by 3 and 5");
            }else{
                System.out.println("Number is divisible by 3 but not 5");
            }
        }else{
            System.out.println("Number is not divisible by 3 or 5");
        }
    }
}

// nested if else
// to add the condition inside the condition

/*
 to check the given number is divisible by 3 as well as 5 or not
 */

import java.util.Scanner;

public class _03_Nested_If_Else
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num % 3 == 0)
        {
            if(num % 5 == 0)
            {
                System.out.println("Number is divisible by 3 as well as  5");
            }else{
                System.out.println("Number is divisible by 3 but not divisible by 5");
            }
        }else{
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}

package Practice;

// check the given number is palindrome or not

import java.util.Scanner;

public class _08_Check_Palindrome_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;

        int ans = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }

        if(num == ans)
        {
            System.out.println("Given number is palindrome number");
        }else{
            System.out.println("Given number is not palindrome number");
        }
    }
}

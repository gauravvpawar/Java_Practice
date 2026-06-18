package Questions;

// check the given number is palidrome number or not


import java.util.Scanner;

public class _11_Palindrome_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;
        while (temp > 0)
        {
            int rem = temp % 10;
            rev = rev* 10 +rem;
            temp /= 10;
        }

        if(rev == num)
        {
            System.out.println("Given number is palindrome number");
        }else{
            System.out.println("Given number is not palindrome number");
        }
    }
}

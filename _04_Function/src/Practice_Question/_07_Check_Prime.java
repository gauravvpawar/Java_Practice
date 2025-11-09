package Practice_Question;

//Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class _07_Check_Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Given number is prime : " + check_Prime(num));
    }

    public static boolean check_Prime(int num)
    {
        if(num == 1)
        {
            return false;
        }

        int i = 2;
        while (i * i <= num)
        {
            if(num % i == 0)
            {
                return false;
            }
            i++;
        }

        return i * i > num;
    }
}

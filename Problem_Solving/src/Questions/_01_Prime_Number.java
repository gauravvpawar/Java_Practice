package Questions;

import java.util.Scanner;

public class _01_Prime_Number
{
    public static void main(String[] args) {
        // check the given number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        boolean check = true;

        if(num == 1)
        {
            System.out.println("1 is composite number");
            return;
        }
        for(int i = 2;i<num;i++)
        {
            if(num % i == 0)
            {
                check = false;
                break;
            }
        }

        if(check)
        {
            System.out.println("Given number is prime number");
        }else{
            System.out.println("Given number is not prime number");
        }
    }
}

package Practice;

// find the prime number till n

import java.util.Scanner;

public class _04_PrimeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int num = sc.nextInt();

        int check = 1;

        for(int i = 2;i<num;i++)
        {
            if(num % i == 0)
            {
                check = 0;
                break;
            }
        }

        if(check == 1)
        {
            System.out.println("Given number is prime number");
        }else{
            System.out.println("Given number is not prime number");
        }


    }
}

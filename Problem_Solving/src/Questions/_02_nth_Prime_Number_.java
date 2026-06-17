package Questions;

// nth prime number


import java.util.Scanner;

public class _02_nth_Prime_Number_
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int i = 1;
        int count = 1;
        if(num == 1)
        {
            System.out.println("1 is not composite");
            return;
        }
        while (count <=num)
        {
            if(checkPrime(i))
            {
                System.out.print(i +" ");
                count++;
            }

            i++; // if the number is prime or not we have increase
        }
    }

    public static boolean checkPrime(int num)
    {
        for(int i = 2;i<num;i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}

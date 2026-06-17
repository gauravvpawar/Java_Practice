package Questions;

// to print the sum of n prime number

public class _03_Sum_Of_N_prime_Number
{
    public static void main(String[] args) {
        System.out.println(prime_Sum(10));
    }
    public static int prime_Sum(int n) {
        // code here
        // int count = 1;
        int i = 1;

        int sum = 0;
        while(i <=n)
        {
            if(checkPrime(i))
            {
                sum = sum + i;
            }

            i++;
        }

        return sum;
    }

    public static boolean checkPrime(int num)
    {
        if(num == 1)
        {
            return false;
        }
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

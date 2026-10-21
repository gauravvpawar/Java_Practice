package _07_Math;

public class _05_Perfect_Number_II
{
    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPerfect(num));
    }

    static boolean isPerfect(int n) {
        // code here

        if(n <= 1)
        {
            return false;
        }
        int sum = 1;
        for(int i = 2;i*i<=n;i++)
        {
            if(n % i == 0)
            {
                sum += i;

                if(i != n / i)
                {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}

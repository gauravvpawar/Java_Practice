package _07_Math;

public class _03_Perfect_Number
{
    public static void main(String[] args) {
        int num = 6;

        System.out.println(isPerfect(num));
    }

    static  boolean isPerfect(int n) {
        // code here
        int sum = 0;
        for(int i = 1;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }

        return sum == n;
    }
}

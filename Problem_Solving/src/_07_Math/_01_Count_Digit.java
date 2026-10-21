package _07_Math;

public class _01_Count_Digit
{
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int count = 0;

        int temp = num;
        while(temp > 0)
        {
            int rem = temp % 10;
            int ans = num % rem;
            System.out.println(ans);
            if(ans == 0)
            {
                count++;
            }
            temp /= 10;
        }

        return count;
    }
}

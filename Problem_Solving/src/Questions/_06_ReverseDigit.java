package Questions;

//https://www.geeksforgeeks.org/problems/reverse-digit0316/1

public class _06_ReverseDigit
{
    public static void main(String[] args) {
        System.out.println(reverseDigits(200));
    }

    public static int reverseDigits(int n) {
        // Code here
        int ans = 0;

        while(n > 0)
        {
            int rem = n % 10;
            if(rem != 0)
            {
                ans = ans * 10 + rem;
            }

            n /= 10;
        }

        return ans;
    }
}

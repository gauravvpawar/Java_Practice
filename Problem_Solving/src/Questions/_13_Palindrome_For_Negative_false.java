package Questions;

public class _13_Palindrome_For_Negative_false
{
    public static void main(String[] args) {
        int number = 10;
        System.out.println("number : " + number + " palindrome : " + isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false;
        }

        int temp = x;
        int rev = 0;
        while (temp > 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == x;
    }
}

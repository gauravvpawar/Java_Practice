package Questions;

// check the given number is palindrome number even the number is negative
// -12321
// palindrome

public class _12_Palindrome_For_Negative_Also {
    public static void main(String[] args) {
        System.out.println("number : -121 ans : " + isPalindrome(-121));
    }

    public static boolean isPalindrome(int n) {
        // code here
        if(n < 0)
        {
            n = n* -1;
        }
        int temp = n;
        int rev = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == n;
    }
}

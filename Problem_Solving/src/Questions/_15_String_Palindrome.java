package Questions;

public class _15_String_Palindrome
{
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String s)
    {

        int start = 0 , end = s.length()-1;

        while(start < end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

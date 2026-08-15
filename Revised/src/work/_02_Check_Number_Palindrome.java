package work;

public class _02_Check_Number_Palindrome
{
    public static void main(String[] args) {
        // check the given number is palindrome or not
        int num = 1221;
        int temp = num;
        int rev = 0;

        while (temp > 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        if(num == rev)
        {
            System.out.println("number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}

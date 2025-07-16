package Task;

import java.util.Scanner;

public class _08_PalindromeString
{
    public static void main(String[] args) {
        // check given string is palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();

        String rev = "";

        for(int i = name.length() -1;i>=0;i--)
        {
            rev += name.charAt(i);
        }

        if(rev.equals(name))
        {
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}

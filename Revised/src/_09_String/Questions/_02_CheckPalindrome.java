package _09_String.Questions;

// check the given string is palindrome or not

import java.util.Scanner;

public class _02_CheckPalindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        int i = 0;
        int j = str.length()-1;

        boolean check = true;

        while (i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                check = false;
                break;
            }

            i++;
            j--;
        }

        if(check)
        {
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}

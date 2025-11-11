package _String_Question;

import java.util.Scanner;

public class _01_String_Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  string : ");
        String str = sc.next();

        boolean check = true;
        int start = 0 , end = str.length()-1;


        while(start < end)
        {
            if (str.charAt(start) != str.charAt(end))
            {
                check =  false;
                break;
            }

            start++;
            end -- ;
        }

        if(!check)
        {
            System.out.println("Given string is not palindrome");
        }else{
            System.out.println("Given string is palindrome");
        }
    }
}

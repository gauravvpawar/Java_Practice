package Practice;

// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class _13_String_Palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :  ");
        String str = sc.next();

        int i = 0 , j = str.length()-1;
        int check = 1;
        while (i <= j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
               check= 0;
            }

            i++;
            j--;
        }

        if(check == 0)
        {
            System.out.println("String is not  palindrome");
        }else{
            System.out.println("String is palindrome");
        }
    }
}

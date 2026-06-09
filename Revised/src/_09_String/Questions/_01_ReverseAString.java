package _09_String.Questions;

import java.util.Scanner;

public class _01_ReverseAString
{
    public static void main(String[] args) {
        // reverse the given string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        char ch[] = str.toCharArray();

        int i = 0;
        int j = str.length()-1;
        while(i < j)
        {
           char temp = ch[i];
           ch[i] = ch[j];
           ch[j] = temp;

           i++;
           j--;
        }

        str = new String(ch);
        System.out.println("string  : " + str);
    }
}

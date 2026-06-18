package _01_Arrays;

import java.util.Arrays;

/*
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class _17_Reverse_String
{
    public static void main(String[] args) {
//        char s[] = {"h","e","l","l","o"};

        char s[] = {'h' ,'e' ,'l','l' , 'o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int start = 0, end = s.length -1;

        while (start < end)
        {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}

package _String_Question;

import java.util.Arrays;

public class _08_Reverse_String
{
    public static void main(String[] args) {
     char arr[] = {'h' , 'e' , 'l' , 'l' , 'o'};
     reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseString(char[] s) {
        // swap the array value
        int i = 0 ,  j = s.length-1;
        while (i < j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}

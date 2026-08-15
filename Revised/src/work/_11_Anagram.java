package work;

import java.util.Arrays;

public class _11_Anagram
{
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        for(int i = 0;i<)

        System.out.println(Arrays.equals(ch1,ch2));
    }
}

package _04_String;

/*
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false

 */
public class _01_Detect_Capital
{
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("world"));
    }

    public static boolean detectCapitalUse(String word) {
        int countUpperCase = 0;

        for(int i = 0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                countUpperCase++;
            }
        }

        return countUpperCase == 0 || countUpperCase == word.length() || countUpperCase == 1 && Character.isUpperCase(word.charAt(0));
    }
}

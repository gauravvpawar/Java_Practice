package _String_Question;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/
//Input: s = "leetcode"

import java.util.HashMap;

//Output: 0
public class _10_First_Unique_Character
{
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character , Integer> hs = new HashMap<>();

        for(char ch : s.toCharArray())
        {
                hs.put(ch , hs.getOrDefault(ch ,0) + 1);
        }

        for(int i = 0;i<s.length();i++)
        {
            if(hs.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        return -1;
    }
}

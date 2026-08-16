package _String_Question;

import java.util.HashMap;

public class _02_Frequency_Of_Character
{
    public static void main(String[] args) {
        // find the frequency of character
        String name = "gaurav";

        HashMap<Character,Integer> hs = new HashMap<>();

        for(char ch : name.toCharArray())
        {
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }

        System.out.println(hs);
    }
}

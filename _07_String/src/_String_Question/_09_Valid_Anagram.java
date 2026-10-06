package _String_Question;

public class _09_Valid_Anagram
{
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
//
//        System.out.println((int)s.charAt(1) - 'a');

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() !=  t.length())
        {
            return false;
        }

        int alpha[] = new int[26];

        for(int i = 0;i<s.length();i++)
        {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }


        for(int count : alpha)
        {
            if(count > 0)
            {
                return false;
            }
        }

        return true;
    }
}

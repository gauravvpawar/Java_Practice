package _String_Question;

public class _04_length_Of_Last
{
    public static void main(String[] args) {
        // find the length of last word
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWordTwo(s));
    }

    public static int lengthOfLastWord(String s) {
        String word[] = s.split(" ");

        int n = word.length;

        return word[n-1].length();
    }

    public static int lengthOfLastWordTwo(String s)
    {
        int lastCount = 0;

        s = s.trim();

        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == ' ')
            {
                break;
            }
            lastCount++;
        }

        return lastCount;
    }
}

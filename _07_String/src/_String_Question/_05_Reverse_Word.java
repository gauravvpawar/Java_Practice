package _String_Question;

public class _05_Reverse_Word
{
    public static void main(String[] args) {
        String str = "Mr Bean"; // output : rM naeB

        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for(String word : words)
        {
          for(int i = word.length()-1;i>=0;i--)
          {
              ans.append(word.charAt(i));
          }
          ans.append(" ");
        }
        return  ans.toString().trim();
    }
}

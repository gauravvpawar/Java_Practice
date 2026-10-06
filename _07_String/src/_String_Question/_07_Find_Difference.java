package _String_Question;

public class _07_Find_Difference {
    public static void main(String[] args) {
        String s = "abcd" , t = "abcde";
        System.out.println(findTheDifference(s , t));
    }

    public static char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for(int i = 0;i<s.length();i++)
        {
          sumS += s.charAt(i);
        }

        for (int i = 0;i<t.length();i++)
        {
            sumT += t.charAt(i);
        }

        return (char)(sumT - sumS);
    }
}

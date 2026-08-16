package _String_Question;

public class _03_Reverse_the_order
{
    public static void main(String[] args) {
        // reverse the order of given string
        String str = "Java is easy";

        String s[] = str.split(" ");

        String ans = "";
        for(int i = s.length-1;i>=0;i--)
        {
            ans += s[i] + " ";
        }

        System.out.println(ans);
    }
}

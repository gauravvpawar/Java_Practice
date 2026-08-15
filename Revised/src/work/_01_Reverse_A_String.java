package work;

public class _01_Reverse_A_String
{
    public static void main(String[] args) {
        // reverse the given String
        String str = "gaurav";

        String ans = "";
        int n = str.length();
        for(int i = n-1;i>=0;i--)
        {
            ans += str.charAt(i);
        }

        System.out.println(ans);
    }
}

package work;

public class _12_Anagram
{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char freq[] = new char[256];

        for(int i = 0;i< str1.length();i++)
        {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int i = 0;i<256;i++)
        {
            if(freq[i] != 0)
            {
                System.out.println("not anagram");
                return;
            }
        }

        System.out.println("anagram");
    }
}

package _04_String;

public class _02_Valid_String
{
    public static void main(String[] args) {

        String str = "cat and dog";

        System.out.println(countValidWords(str));
    }

    public static int countValidWords(String sentence) {
        int count = 0;
        String words[] = sentence.split(" ");
        for(String word : words)
        {
            if(word.length() == 0)
            {
                continue;
            }

            if(checkCondition(word))
            {
                count++;
            }
        }

        return count;
    }


    public static boolean checkCondition(String word)
    {
        int hypen = 0;

        for(int i = 0;i<word.length();i++)
        {
            char ch = word.charAt(i);

            if(Character.isDigit(ch))
            {
                return false;
            }

            if(ch == '-')
            {
                hypen++;

                // if the second - found
                if(hypen > 1)
                {
                    return false;
                }

                // hypen cannot be found at first and last
                if(i == 0 && i == word.length() -1)
                {
                    return false;
                }

                if(!Character.isLowerCase(word.charAt(i-1)) && !Character.isLowerCase(word.charAt(i+1)))
                {
                    return false;
                }
            }

            if(ch == '!' || ch == '.' || ch == ',')
            {
                if(i != word.length()-1)
                {
                    return false;
                }
            }

        }

        return true;
    }
}

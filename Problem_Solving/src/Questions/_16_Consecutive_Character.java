package Questions;

//https://leetcode.com/problems/consecutive-characters/
// find the consecutive character present in string

public class _16_Consecutive_Character {
    public static void main(String[] args) {
//        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        int count = 1;
        int maxCount = 1;

        for(int i =  1;i<s.length();i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                count++;
            }else{
                count = 1;
            }

            if(count > maxCount)
            {
                maxCount = count;
            }

        }

        return maxCount;
    }
}

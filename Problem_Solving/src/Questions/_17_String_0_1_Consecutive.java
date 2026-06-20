package Questions;

public class _17_String_0_1_Consecutive
{
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("011000111"));
    }

    public static boolean checkZeroOnes(String s) {
        int count1 = 0;
        int count0 = 0;
        int maxCountOne = 0;
        int maxCountZero = 0;

        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                count1++;

                if(count1 > maxCountOne)
                {
                    maxCountOne = count1;
                }
            }else{
                count0++;

                if(count0 > maxCountZero)
                {
                    maxCountZero = count0;
                }
            }
        }

        return maxCountZero < maxCountOne;
    }
}

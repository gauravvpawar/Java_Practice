package Questions;

///https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class _18_Number_Of_Step_To_Zero
{
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        int count  = 0;
        while(num > 0)
        {
            if(num % 2 == 0)
            {
                num /= 2;
                count++;
            }

            if(num % 2 != 0)
            {
                num -= 1;
                count++;
            }
        }

        return count;
    }
}

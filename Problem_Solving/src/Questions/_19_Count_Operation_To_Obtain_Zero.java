package Questions;

//https://leetcode.com/problems/count-operations-to-obtain-zero/description/


public class _19_Count_Operation_To_Obtain_Zero
{
    public static void main(String[] args) {
//        System.out.println(countOperations(2, 3));
        System.out.println(countOperations(10,10));
    }

    public static int countOperations(int num1, int num2) {
        int count = 0;

        while (num1 != 0 && num2 != 0)
        {
            if(num1 < num2)
            {
                num2 = num2 - num1;
                count++;
            }else{
                num1 = num1 - num2;
                count++;
            }

        }
        return count;
    }
}

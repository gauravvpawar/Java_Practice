package Practice;

// Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

public class _17_Count_Days
{
    public static void main(String[] args) {
        int august = 31;
        int count = 0;
        for(int i = 1;i<=august;i++)
        {
            if(i % 2 == 0)
            {
                count++;
            }
        }

        System.out.println("kunal can go out his friend : " + count);
    }
}

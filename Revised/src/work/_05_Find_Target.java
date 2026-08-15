package work;

public class _05_Find_Target
{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3 ,4 ,5};
        int target = 2;
        int idx = -1;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        System.out.println("target idx : " + idx);
    }
}

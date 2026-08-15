package work;

public class _07_Find_Min
{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4, 5};
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < min )
            {
                min = i;
            }
        }

        System.out.println(min);
    }
}

package work;

public class _04_find_duplicate
{
    public static void main(String[] args) {
        int arr[] = {1 ,2 , 3 ,4  ,5 ,2};
        int ans = -1;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;i<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    ans = arr[i];
                }
            }
        }

        System.out.println("ans : " + ans);
    }
}

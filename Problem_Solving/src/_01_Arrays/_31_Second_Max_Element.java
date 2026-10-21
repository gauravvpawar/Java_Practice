package _01_Arrays;

public class _31_Second_Max_Element
{
    public static void main(String[] args) {
//        int arr[] = {1 , 2 ,3 , 4 ,5};
//        int arr[] = { -5 ,-10 , -2 , -8};
        int arr[] = { 7 , 7 , 7 , 7};
        int smax = findSecondMaxII(arr);
        System.out.println(smax);
    }

    public static int findSecondMax(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];
            }else if(smax < arr[i] &&  max != arr[i] )
            {
                smax = arr[i];
            }
        }

        return smax;
    }

    public static int findSecondMaxII(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        boolean foundSecondMax = false;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];

                if(smax != Integer.MIN_VALUE)
                {
                    foundSecondMax = true;
                }
            }else if(smax < arr[i] &&  max != arr[i] )
            {
                smax = arr[i];
                foundSecondMax = true;
            }
        }

        return foundSecondMax ? smax : -1;
    }
}

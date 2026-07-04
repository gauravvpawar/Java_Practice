package _06_Searching;

public class _06_Find_In_Mountain_Array
{
    public static void main(String[] args) {

    }
/*
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int findPeak = findPeak(mountainArr);
        int n = mountainArr.length();
        if(findPeak != -1)
        {
            return binarySearch(mountainArr , target ,0 , findPeak , true);
        }

        return binarySearch(mountainArr , target , findPeak + 1 , n-1 , false );
    }

    public static int binarySearch(MountainArray mountainArr , int target , int start , int end , boolean isLeft)
    {
        while (start <=  end)
        {
            int mid = start + (end - start)  /2;

            if(mountainArr.get(mid) == target)
            {
                return mid;
            }

            if(isLeft)
            {
                if(mountainArr.get(mid) < target)
                {
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if(mountainArr.get(mid) < target)
                {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


    public static int findPeak(MountainArray mountainArr)
    {
        int start = 0 , end = mountainArr.length();

        while(start < end)
        {
            int mid = start + (end - start) /2;

            if(mountainArr.get(mid) < mountainArr.get(mid+1))
            {
                start = mid + 1;
            }else if(mountainArr.get(mid) > mountainArr.get(mid + 1))
            {
                end = mid;
            }
        }

        return end;
    }
    */

}

import java.util.Scanner;

public class _02_Binary_Search
{
    public static void main(String[] args) {
        /*
            binary search is need the array in the  sorting order
            it find the mid of arr size and check if ->
             - target > arr[mid] → move right (start = mid + 1)
            - target < arr[mid] → move left (end = mid - 1)
            - target == arr[mid] → element found
             */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the array element : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number you want to search : ");
        int target = sc.nextInt();
        int start = 0 , end = arr.length-1;
        int idx = -1;
        while (start <= end)
        {
            int mid = (start + end ) / 2;

            if(target > arr[mid])
            {
                start = mid + 1;
            }else if(target < arr[mid])
            {
                end = mid - 1;
            }else{
               idx = mid;
               break;
            }
        }

        System.out.println("target is present at idx : " + idx);
    }
}

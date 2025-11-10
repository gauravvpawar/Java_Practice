import java.util.Scanner;

public class _01_Linear_Search
{
    public static void main(String[] args) {
        /*
         in linear search -> it iterate overall array and check whether the given target element present in array or not
         if it is then it return true or else it return -1
         the time complexity of Linear search O(n)   n is size of the array
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter number in array : ");
        for(int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number : ");
        int target = sc.nextInt();

        System.out.println("Target element is present at idx :" + find_Target(arr,target));
    }

    public static int find_Target(int arr[] , int target)
    {
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}

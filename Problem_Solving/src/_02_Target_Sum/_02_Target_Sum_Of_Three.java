package _02_Target_Sum;

/*
Enter the size of array :
5
Enter the array element :
1 2 3 4 5
Enter the target number :
8 (1+2+5) and (1 + 3 + 4)
count pairs  : 2

 */
import java.util.Scanner;

public class _02_Target_Sum_Of_Three
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number : ");
        int x = sc.nextInt();

        System.out.println("count pairs  : " + findCount(arr , x));
    }

    public static int findCount(int arr[] , int target)
    {
        int count = 0;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                for(int k = j+1;k<arr.length;k++)
                {
                    if(arr[i] + arr[j] + arr[k] == target)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

import java.util.Scanner;

public class _02_1Dimension_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i = 0;i<num;i++)
        {
            System.out.println("Enter the array " + i + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        for (int i = 0;i<num;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("using enhanced for loop");
        // enhanced for loop
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
}

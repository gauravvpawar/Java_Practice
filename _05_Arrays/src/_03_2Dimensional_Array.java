import java.util.Arrays;
import java.util.Scanner;

/*
    2 Dimension array always store in the row and matrix format
    - when data you want to store in the tabular format
 */

public class _03_2Dimensional_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row in array : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of col in array : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

//
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));


        System.out.println("Original Array : ");
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

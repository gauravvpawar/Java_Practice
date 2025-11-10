import java.util.Scanner;

public class _03_Multi_Dimension_Array
{
    public static void main(String[] args) {
        /*
            to define the  multi dimension array ->
                who have matrix inside each array element
                multi-dimension array declare
                int arr[][][] = new int[2][3][3];
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the row size of array : ");
        int row = sc.nextInt();
        System.out.println("Enter the col size of array : ");
        int col = sc.nextInt();

        int arr[][][] = new int[n][row][col];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter the "+ i + " array value : ");
            for(int j = 0;j<row;j++)
            {
                for(int k = 0;k<col;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("original array : ");
        for(int i = 0;i<n;i++)
        {
            System.out.println("Printing  " + i + " array: ");
            for(int j = 0;j<row;j++)
            {
                for(int k = 0;k<col;k++)
                {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}

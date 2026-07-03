package _05_Matrix;

public class _02_Rotate_By_90_Degree
{
    public static void main(String[] args) {
        // rotate array in 90 degree
        /*
        [1 , 2 , 3]   [1 , 4 , 7]   [7  , 4 , 1]
        [4 , 5 , 6] => [2 , 5, 8] => [8 , 5 , 2]
        [7 , 8 , 9]    [3 , 6 , 9]   [9 , 6 , 3]
         */


        int arr[][] = {
                {1, 2 , 3} ,
                {4 , 5 ,6},
                {7, 8 , 9}
        };

        printArray(arr);

        ArrayRotate(arr);
    }

    public static void ArrayRotate(int arr[][])
    {
        // first to find the transpose
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0;i<c;i++)
        {
            for(int j = i;j<r;j++)
            {
                arr[i][j] = arr[j][i];
            }
        }
    }

    public static void printArray(int arr[][])
    {
        int r = arr.length;
        int c = arr[0].length;

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
}

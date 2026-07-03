package _05_Matrix;

/*
Transpose of given matrix
 */
public class _01_Transpose
{
    public static void main(String[] args) {
        int arr[][] = {
                {1 , 2 , 3} ,
                {4 , 5 , 6},
                {7 ,8 ,9}
        };

        transponse(arr);
        printArray(arr);
    }

    public static void transponse(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < c; i++)
        {
            for(int j = i;j<r;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}

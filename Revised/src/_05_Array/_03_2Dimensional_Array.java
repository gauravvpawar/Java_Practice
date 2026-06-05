package _05_Array;

public class _03_2Dimensional_Array
{
    public static void main(String[] args) {
        // in 2 Dimensional Array
        /*
         it look like matrix format we have to iterate through row and column
         */

        // To declare the 2D Array
        int arr[][] = new int[2][3];
        int arr2[][] = {{1,2,3} ,
                        {4,5,6},
                        {7,8,9}
                        };

        System.out.println("Print Array 2 : ");
        // print the array
        for(int i = 0;i<arr2.length;i++)
        {
            for(int j = 0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}

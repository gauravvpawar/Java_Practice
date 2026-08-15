package work;

import java.util.Scanner;

public class _02_Array
{
    public static void main(String[] args) {
        // array is the collection of homogeneous type of element
        // you cannot change array size while runtime
        // array sized is fixed
        // advantages of array
        // random accessing of element
        // code optimisation
        // searching easily
        // sorting easily

        // disadvantage of array
        // fixed sized
        // only homogeneous type of element we can store
        // insertion and deletion operation is complex

        // to declare the array
        // single array
        // 2d array
        // multidimensional array
        // jagged array
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5]; // you have to always define the size of array
        // to take input of array element
        for(int i = 0;i<5;i++)
        {
            arr1[i] = sc.nextInt();
        }

        // to print the array element
        for(int i = 0;i<5;i++)
        {
            System.out.print(arr1[i] +" ");
        }

        // 2 dimension array is like a matrix format in that we have row as well as column
        int arr2[][] = {
                {1 , 2 , 3} ,
                {4 , 5 ,6 },
                {7 , 8 , 9},
        };

        // to iterate over the 2d array we have to used nested for loop

        // in multidimensional array in that we have each array have matrix like element
        int arr3[][][] = new int[2][3][3];

        //4 we have jagged array the in row their it might the number of column is different
        int arr4[][] = {
                {1, 2 , 3},
                {4},
                {5 , 6}
        };
    }
}

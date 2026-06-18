package _01_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _15_Element_Frequency
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array element : ");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array : ");
        System.out.println(Arrays.toString(arr));

        int[] frequencyArray = findFrequencyOfElement(arr);

        int check = arr.length;
        while (check >=0)
        {
            System.out.println("Enter the check element : ");
            int x = sc.nextInt();

            if(frequencyArray[x] > 0)
            {
                System.out.println("True");
            }else {
                System.out.println("False");
            }

            check--;
        }
    }

    public static int[] findFrequencyOfElement(int arr[])
    {
        int n = arr.length;

        int freq[] = new int[100005];
        for(int i = 0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }

        return freq;
    }
}

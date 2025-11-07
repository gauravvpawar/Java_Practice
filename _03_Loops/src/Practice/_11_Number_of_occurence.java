package Practice;

// find the number of occurrence in the given number

import java.util.Scanner;

public class _11_Number_of_occurence
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the searching number : ");
        int target = sc.nextInt();
        int count = 0;
        while (num > 0)
        {
            int rem = num % 10;
            if(rem == target)
            {
                count++;
            }
            num /= 10;
        }

        System.out.println("Number of occurrence : " + count);
    }
}

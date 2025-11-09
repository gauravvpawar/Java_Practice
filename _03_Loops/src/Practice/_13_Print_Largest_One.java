package Practice;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class _13_Print_Largest_One
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largeNumber = 0 , num;
        do{
            System.out.println("Enter the  number : ");
            num = sc.nextInt();
            if(largeNumber < num)
            {
                largeNumber = num;
            }

        }while (num != 0);

        System.out.println("Largest number : " + largeNumber);
    }
}

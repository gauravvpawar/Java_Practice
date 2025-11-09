package Practice_Question;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class _01_Print_Max_And_Min
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        System.out.println("Minimum number of three : " + find_min(a , b , c));
        System.out.println("Maximum number of three : " + find_max(a , b , c));
    }

    public static int find_min(int a , int b , int c)
    {

        if(a < b && a < c )
        {
            return a;
        }else if(b < a && b < c)
        {
            return b;
        }

        return c;
    }

    public static int find_max(int a , int b , int c)
    {

        if(a > b && a > c )
        {
            return a;
        }else if(b > a && b > c)
        {
            return b;
        }

        return c;
    }
}

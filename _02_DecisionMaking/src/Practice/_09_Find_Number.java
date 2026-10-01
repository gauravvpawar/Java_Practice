package Practice;

import java.util.Scanner;

public class _09_Find_Number
{
    public static void main(String[] args) {
        // take input from the user and check positive negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }else if(num < 0)
        {
            System.out.println("Number is negative");
        }else{
            System.out.println("Given number is zero");
        }
    }
}

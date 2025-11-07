package Practice;

// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class _10_Take_Input_0_enter_showSum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , sum = 0;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        while(num != 0){
          sum = sum + num;
          System.out.println("Enter the number : ");
          num = sc.nextInt();
        }

        System.out.println("Sum : " + sum);
    }
}

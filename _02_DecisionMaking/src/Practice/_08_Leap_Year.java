package Practice;

import java.util.Scanner;

public class _08_Leap_Year
{
    public static void main(String[] args) {
        // check the given year is leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        if(year % 400 == 00 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year is not leap year");
        }

    }
}

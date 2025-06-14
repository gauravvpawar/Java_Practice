package _01_Flow_OF_Program;

import  java.util.*;

public class _01_LeapOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the year : ");
        year = sc.nextInt();

        if(year % 4 == 0 && (year % 100 == 0 && year % 400 == 0))
        {
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year is not leap year");
        }

    }
}

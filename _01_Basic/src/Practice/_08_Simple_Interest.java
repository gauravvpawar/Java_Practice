package Practice;

// write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class _08_Simple_Interest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal , rate , time ;

        System.out.println("Enter the principal values : ");
        principal = sc.nextInt();
        System.out.println("Enter the rate value : ");
        rate = sc.nextInt();
        System.out.println("Enter the time  : ");
        time = sc.nextInt();

        float SI = (principal * rate * time) / 100;

        System.out.println("Simple interest of prn : " + SI);

    }
}

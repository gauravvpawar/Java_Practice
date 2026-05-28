package _01_Basic.ParcticeQuestion;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// (P* R * T)/100
public class _03_SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount : ");
        int principle = sc.nextInt();

        System.out.println("Enter Annual Rate :");
        int rate = sc.nextInt();

        System.out.println("Enter the Time : ");
        int time = sc.nextInt();

        float SimpleInterest = (principle * rate * time)/100;
        System.out.println("Simple Interest : " + SimpleInterest);
    }
}

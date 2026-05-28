package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _11_AreaOfRectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int length = sc.nextInt();

        System.out.println("Enter the breadth of rectangle : ");
        int breadth = sc.nextInt();

        int AreaOfRect = length * breadth;
        System.out.println("Area of Rectangle : " + AreaOfRect);

    }
}

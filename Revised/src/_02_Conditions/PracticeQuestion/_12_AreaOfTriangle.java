package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// Area of triangle = 1/2 * base * height
public class _12_AreaOfTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of triangle : ");
        float height = sc.nextFloat();

        System.out.println("Enter the base of triangle : ");
        float base = sc.nextFloat();

        float AreaOfTriangle = 1f/2f * (base * height);
        System.out.println("Area of triangle : " + AreaOfTriangle);
    }
}

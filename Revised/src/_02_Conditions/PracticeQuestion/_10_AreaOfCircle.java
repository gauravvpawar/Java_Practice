package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

//Area Of Circle Java Program = pie * rad ^2
public class _10_AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float rad = sc.nextFloat();
        float pie = 3.14159f;

        float Area = pie * rad * rad;
        System.out.println("Area of circle : " + Area);
    }
}

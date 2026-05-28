package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _13_AreaOfParallelogram
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of parallelogram : ");
        float base = sc.nextFloat();

        System.out.println("Enter the height of parallelogram : ");
        float height = sc.nextFloat();

        float AreaOfParallelogram = base * height;
        System.out.println("Area of Parallelogram : " + AreaOfParallelogram);
    }
}

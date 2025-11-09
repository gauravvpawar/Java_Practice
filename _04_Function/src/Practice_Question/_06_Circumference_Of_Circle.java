package Practice_Question;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class _06_Circumference_Of_Circle
{
    static float Pie  = 3.142f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        int radius = sc.nextInt();

        System.out.println("Circumference of  circle : " + circumference_find(radius));
    }

    public static float circumference_find(int rad)
    {
        return 2 * Pie * rad;
    }
}

package Practice;

// area of rectangle

import java.util.Scanner;

public class _04_Area_of_Rectangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int length = sc.nextInt();

        System.out.println("Enter the Breadth of rectangle : ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println("Area of rectangle : " + area);
    }
}

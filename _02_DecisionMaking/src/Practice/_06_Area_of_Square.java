package Practice;

// find the area of square

import java.util.Scanner;

public class _06_Area_of_Square
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of square : " + area);
    }
}

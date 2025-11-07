package Practice;

import java.util.Scanner;

public class _05_Area_Of_Triangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base of triangle : ");
        int base = sc.nextInt();
        System.out.println("Enter the height of triangle : ");
        int height = sc.nextInt();

        float area = (height * base ) / 2;
        System.out.println("Area of triangle : " + area);
     }
}

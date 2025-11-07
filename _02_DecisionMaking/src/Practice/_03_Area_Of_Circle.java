package Practice;

// Area Of Circle Java Program

import java.util.Scanner;

public class _03_Area_Of_Circle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        float radius = sc.nextFloat();

        float pie = 3.142f;

        float ans = pie * radius* radius;
        System.out.println("area of circle : " + ans);
    }
}

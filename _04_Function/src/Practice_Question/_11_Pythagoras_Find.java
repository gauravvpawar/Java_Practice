package Practice_Question;

//Write a function to check if a given triplet is a Pythagorean triplet or not.
//        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class _11_Pythagoras_Find
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the side 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter the side 3 : ");
        int c = sc.nextInt();

        System.out.println("Pythagorean triplet : " + check_Sides(a , b , c));
    }

    public static boolean check_Sides(int x , int y , int z)
    {
        return z*z == ((x*x) + (y * y));
    }
}

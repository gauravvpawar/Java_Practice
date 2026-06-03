package _04_Function.PracticeQuestion;

import java.util.Scanner;

// check the given side is pythagorean triplet or not
public class _12_PythagoreanTriplet
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 : ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side 2 : ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side 3 : ");
        int side3 = sc.nextInt();

        System.out.println("The given sides is Pythagorean triplet : " + checkPythagorean(side1,side2 ,side3));
    }

    public static boolean checkPythagorean(int a , int b , int c)
    {
        if((c*c == (a*a)+(b*b)) || (a*a == (b*b)+(c*c)) || (b*b == (a*a)+(c*c)))
        {
            return true;
        }

        return false;
    }
}

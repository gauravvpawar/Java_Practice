package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// Area of Rhombus = 1/2* digonal(p) * diagonal (q)
public class _14_AreaOfRhombus
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digonal p of Rhombus : ");
        float p = sc.nextFloat();

        System.out.println("Enter the diagonal q of rhombus : ");
        float q = sc.nextFloat();

        float AreaOfRhombus = 1f/2f *( p * q);
        System.out.println("Area of Rhombus = " + AreaOfRhombus);
    }
}

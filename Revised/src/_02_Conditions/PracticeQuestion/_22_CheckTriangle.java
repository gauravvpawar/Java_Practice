package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// take input of three side of tringle and check the given triangle
public class _22_CheckTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 of triangle : ");
        int side1 = sc.nextInt();

        System.out.println("Enter the side 2 of triangle : ");
        int side2 = sc.nextInt();

        System.out.println("Enter the side 3 of triangle : ");
        int side3 = sc.nextInt();

        if(((side1 + side2) > side3) && ((side2 + side3 > side1) && (side1+side3 > side2)))
        {
            System.out.println("the given side valid for equality theorem");
        }else{
            System.out.println("The given side is not valid for equality theorem");
        }
    }
}

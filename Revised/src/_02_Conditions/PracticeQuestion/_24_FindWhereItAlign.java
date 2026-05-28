package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

public class _24_FindWhereItAlign
{
    public static void main(String[] args) {
        // enter the coordinate points and find the where points get align in it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinate points : ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if(x > 0 && y > 0)
        {
            System.out.println("It lies between I region");
        }else if(x < 0 && y > 0)
        {
            System.out.println("It lies between II region");
        }else if(x < 0 && y < 0)
        {
            System.out.println("It lies between III region");
        }else if(x > 0 && y == 0)
        {
            System.out.println("It lies on x Axis");
        }else if(x == 0 && y > 0)
        {
            System.out.println("It lies on y axis");
        }
        else  {
            System.out.println("It lies between IV region");
        }
    }
}

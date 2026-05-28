package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// take input of three points of coordinate check points line in same line or not
public class _23_AlignOnStraightLine
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first x , y coordinate : ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.println("Enter the second x , y coordinate : ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        System.out.println("Enter the third x , y coordinate : ");
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();

        float m1 = (y2 - y1) / (x2-x1);
        float m2 = (y3 - y2) / (x3 - x2);

        if(m1 == m2)
        {
            System.out.println("Coordinate lie on straight line");
        }else{
            System.out.println("Coordinate does not lie on straight line");
        }
    }
}

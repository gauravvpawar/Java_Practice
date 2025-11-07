// else if ladder to check the multiple condition

import java.util.Scanner;

public class _02_Else_If_Ladder
{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks > 91)
        {
            System.out.println("A Grade");
        }else if(marks < 90 && marks > 80)
        {
            System.out.println("B Grade");
        }else if(marks < 80 && marks > 70)
        {
            System.out.println("C Grade");
        }else if(marks < 70 && marks > 60)
        {
            System.out.println("D Grade");
        }else if(marks < 60 && marks > 50)
        {
            System.out.println("E Grade");
        }else{
            System.out.println("Fail");
        }
    }
}

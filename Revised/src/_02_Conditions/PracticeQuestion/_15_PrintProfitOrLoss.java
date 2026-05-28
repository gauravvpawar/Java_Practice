package _02_Conditions.PracticeQuestion;

import java.util.Scanner;
// find how much profit he made or loss
public class _15_PrintProfitOrLoss
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost price : ");
        float cp = sc.nextFloat();

        System.out.println("Enter the selling price : ");
        float sp = sc.nextFloat();

        float check = sp - cp;

        if(check > 0)
        {
            System.out.println("You made profit in selling : " + check + "₹");
        }else {
            System.out.println("you made loss in selling : " + check + "₹");
        }
    }
}

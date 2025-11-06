package Practice;

//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class _04_HCM
{

    public static int find_min(int a , int b)
    {
        if(a < b)
        {
            return a;
        }

        return  b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        for(int i = find_min(num1 , num2);i>=1;i--)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                System.out.println("hcf : " + i);
                break;
            }
        }
    }
}

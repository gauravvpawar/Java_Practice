package _01_Flow_OF_Program;

//Take 2 numbers as inputs and find their HCF and LCM.



import  java.util.*;

public class _04_HCFandLCM
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 ,num2;
        System.out.println("Enter the number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        num2 = sc.nextInt();

        int hcf = 0;
        for(int i = 1;i<=num2;i++)
        {
            if( num1 * i == num2*i)
            {
                hcf = num2 * i;
            }
        }
    }
}

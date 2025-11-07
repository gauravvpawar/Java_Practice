package Practice;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class _14_ArmstrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int num = sc.nextInt();

        int countNum = countDigit(num);

        int temp = num;
        int ans = 0;
        while(temp > 0)
        {
            int rem = temp % 10;
            ans = ans + Find_power(rem , countNum);
            temp /= 10;
        }

        if(ans == num)
        {
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not armstrong number");
        }


    }

    public  static  int Find_power(int a , int power)
    {
        int ans = 1;
        for(int i = 1;i<=power;i++)
        {
            ans = ans * a;
        }

        return   ans;
    }

    public  static  int countDigit(int num)
    {
        int countNum = 0;
        int temp = num;
        while(temp > 0)
        {
            countNum++;
            temp /= 10;
        }
        return  countNum;
    }
}

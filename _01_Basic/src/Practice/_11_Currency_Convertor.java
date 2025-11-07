package Practice;

//Input currency in rupees and output in USD.

import java.util.Scanner;

public class _11_Currency_Convertor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees :  ");
        int rupees = sc.nextInt();

        float usd_price = 88.65f;

        float ans = rupees / usd_price;
        System.out.println("Ans : " + ans + "$");

    }
}

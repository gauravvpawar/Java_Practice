package _01_Basic.ParcticeQuestion;

import java.util.Scanner;

//Input currency in rupees and output in USD
public class _06_INRToUSD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupee : ");
        int amount = sc.nextInt();

        float USD = amount / 96.0f;
        System.out.println("USD Amount : " + USD + " $");
    }
}

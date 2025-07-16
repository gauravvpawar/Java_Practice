package Task;

import java.util.Scanner;

public class _03_SimpleInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle , rate , time;
        System.out.println("Enter the principle amount : ");
        principle = sc.nextInt();
        System.out.println("Enter the rate amount : ");
        rate = sc.nextInt();
        System.out.println("Enter the time  of SI : ");
        time = sc.nextInt();

        float SimpleInterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest: " + SimpleInterest);
    }
}

package _02_Conditions.PracticeQuestion;

import java.util.Scanner;

// take three input from the user and print the least age one
public class _21_LeastAgeOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram age : ");
        int ram = sc.nextInt();

        System.out.println("Enter Shyam age : ");
        int shyam = sc.nextInt();

        System.out.println("Enter Arjun age : ");
        int arjun = sc.nextInt();

        if(ram < shyam && ram < arjun)
        {
            System.out.println("Least age of them is Ram : " + ram);
        }else if(shyam < ram && shyam < arjun)
        {
            System.out.println("Least age of them is shyam : " + shyam);
        }else {
            System.out.println("Arjun is least one : " + arjun);
        }
    }
}

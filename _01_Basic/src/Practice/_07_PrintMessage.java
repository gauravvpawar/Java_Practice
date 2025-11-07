package Practice;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class _07_PrintMessage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        System.out.println("Welcome back : " + name);
    }
}

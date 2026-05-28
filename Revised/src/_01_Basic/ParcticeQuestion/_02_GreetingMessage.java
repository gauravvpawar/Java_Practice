package _01_Basic.ParcticeQuestion;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class _02_GreetingMessage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name : ");
        String name = sc.next();

        System.out.println("hello "+name);
    }
}

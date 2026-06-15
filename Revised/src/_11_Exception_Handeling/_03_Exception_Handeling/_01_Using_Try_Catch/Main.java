package _11_Exception_Handeling._03_Exception_Handeling._01_Using_Try_Catch;

// using try and catch block
// we always write risky code inside try block
// and if the exception is occurs then catch block catch the exception

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        try { // in try we write which code can might throw exception
            int c = a/b; // if the number divide by zero it gives exception
            System.out.println("c : " +c);
        }catch (Exception e)
        {
            System.out.println("Exception occur : " + e);
        }
    }
}

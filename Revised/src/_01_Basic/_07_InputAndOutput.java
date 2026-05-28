package _01_Basic;

import java.util.Scanner;

public class _07_InputAndOutput
{
    public static void main(String[] args) {
        // in java we can take input through
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in); //this is constructor to take the input from system
        String name = sc.next();

        System.out.println("Hello " + name);
    }
}

package _12_MultiThreading._01_Single_Thread;

// java by default single threaded language
// in java we can achieve multiple thread execute at a single time

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        // till you did not enter your name it wont run
        for(int i = 0;i<5;i++)
        {
            System.out.println("i : " + i);
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        for(int j = 0;j<3;j++)
        {
            System.out.println("Bye !");
        }
    }
}

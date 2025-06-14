package _01_Flow_OF_Program;

// Take a number as input and print the multiplication table for it.
import  java.util.*;
public class _03_PrintTable
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
            System.out.println(num + " X " + i + " = "+ (num * i)  );
        }
    }
}

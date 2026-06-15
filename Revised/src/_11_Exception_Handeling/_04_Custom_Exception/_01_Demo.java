package _11_Exception_Handeling._04_Custom_Exception;

// when you create the custom exception then you have to extend the RuntimeException class and provide the msg in constructor
// in custom exception you have to use throw keyword used for to create custom exception

import java.util.Scanner;

class AgeInvalid extends RuntimeException
{
    AgeInvalid(String s)
    {
        super(s);
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You are eligible for vote");
        }else{
            try{
                throw new AgeInvalid("Under age"); // this is custom exception
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Visit Again !");
    }
}

package Loops;

import java.util.Scanner;

public class _01_validUser
{
    public static void main(String[] args) {
        String db_username = "Alex";
        String db_password = "xyz";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username : " );
        String username = sc.next();
        System.out.println("Enter the password : ");
        String password = sc.next();

        if(username.equals(db_username) && password.equals(db_password))
        {
            System.out.println("User login successfully");
        }else {
            System.out.println("incorrect data, try again ");
        }

        System.out.println("Thank you");
    }
}

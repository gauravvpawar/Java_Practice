// ternary operator it is the short form of the if else condition

import java.util.Scanner;

public class _04_Ternary_Operator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password : ");
        int password = sc.nextInt();


        String result = (password == 1234) ? "password is valid" : "Username is not valid";
        System.out.println(result);
    }
}

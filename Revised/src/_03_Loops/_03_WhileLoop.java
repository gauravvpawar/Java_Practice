package _03_Loops;

import java.util.Scanner;

public class _03_WhileLoop
{
    public static void main(String[] args) {
        // while loop same work as for loop but while loop used for when you dont know how much time loop going to execute
        // that time we can use while loop

        // enter the name till the user did not guess the correct exepected num
        Scanner sc = new Scanner(System.in);

        int computerNum = (int)(Math.random() * 100) + 1;
//        System.out.println("ComputerNum : " + computerNum);
        System.out.println("Enter the num : ");
        int userNum = sc.nextInt();
        while (computerNum != userNum)
        {
            System.out.println("You guess wrong");

            if(computerNum < userNum)
            {
                System.out.println("You entered higher number");
            }else{
                System.out.println("You entered lower number");
            }

            System.out.println("Enter your number again : ");
            userNum = sc.nextInt();
        }

        System.out.println("Congrats ! you did it");

    }
}

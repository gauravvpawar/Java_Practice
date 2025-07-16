package Task;

import java.util.Scanner;

public class _05_FindGreaterOne
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt();

        if(firstNum > secondNum)
        {
            System.out.println("First num is greater");
        }else{
            System.out.println("Second num is greater");
        }
    }
}

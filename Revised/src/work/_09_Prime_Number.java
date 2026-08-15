package work;

import java.util.Scanner;

public class _09_Prime_Number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int check = 1;
//        int i = 2;
        for(int i = 2;i<num;i++)
        {
           if(num % i == 0)
           {
               check =0;
               break;
           }
        }

        if(check == 1)
        {
            System.out.println("number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}

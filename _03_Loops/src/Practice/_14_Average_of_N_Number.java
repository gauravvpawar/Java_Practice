package Practice;

import java.util.Scanner;

public class _14_Average_of_N_Number
{
    public static void main(String[] args) {
//        calculate the average of n number if user enter x print average of all

        Scanner sc = new Scanner(System.in);

        String num;
        int sum = 0 , count = 0;
        do
        {
            System.out.println("Enter the number : ");
            num = sc.next();

            if(num.equals("x"))
            {
                break;
            }
            sum = sum + Integer.parseInt(num);
            count++;
        }while (true);


        System.out.println("Average of n number : " +(double)(sum /count));

//        System.out.println("Average : " + sum /num);
    }
}

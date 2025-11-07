package Practice;

import java.util.Scanner;

//  count  the digit of the number
public class _05_Count_Digit
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = Sc.nextInt();

        int count = 0;
        while(num > 0)
        {
            int  rem = num % 10;
            if(rem != 0)
            {
                count++;
            }

            num /= 10;
        }

        System.out.println("Count of digit : " + count);
    }
}

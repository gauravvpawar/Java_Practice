
import java.util.*;

public class _01_CheckPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if( num == 1)
        {
            System.out.println("1 is not a prime number ");
            return;
        }
        boolean check = true;

        for(int i = 2;i<num;i++)
        {
            if(num % i == 0)
            {
                check = false;
                break;
            }
        }


        if(check)
        {
            System.out.println("Given enter number is prime number");
        }else{
            System.out.println("Given enter number is not prime number");
        }

        sc.close();
    }
}

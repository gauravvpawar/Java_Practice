import java.util.*;

public class _06_LoopInfo
{
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++)
        {
            System.out.println("Student : " + i);
        }

        // while-loop it is check weather the user dont know the how many time you have to iterate
        int k= 0;
        while(k <= 10)
        {
            System.out.println("Student : " + k);
            k++;
        }

//        do while loop is always execute weather condition is also false
        Scanner sc =  new Scanner(System.in);
        int check;
        do{
            System.out.println("Enter the first number : ");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();

            System.out.println("Addition of two number is : " + (a + b));
            System.out.println("Enter the 1 if you want to try again !!");
            check = sc.nextInt();
        }while (check == 1);

        System.out.println("Bye Bye !!");
    }
}

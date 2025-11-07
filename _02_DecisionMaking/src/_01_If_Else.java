import java.util.Scanner;

public class _01_If_Else
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age > 18)
        {
            System.out.println("You are eligible for driving");
        }else{
            System.out.println("You are not eligible for driving");
        }
    }
}

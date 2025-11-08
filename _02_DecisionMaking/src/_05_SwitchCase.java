import java.util.Scanner;

public class _05_SwitchCase
{
    public static void main(String[] args) {

        /*
        switch case is used to check the value without messing up with the multiple if else condition
        switch case is directly check the variable value
        switch case have the break variable that break the all case while checking
        if you do not provide the break statement it execute while match the case and print the below all the statement
        without breaking

        syntax ->
        switch(){
            case : print
                    break;
             case : print
                break;

        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case  3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}

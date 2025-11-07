public class _03_Do_While
{
    public static void main(String[] args) {

        /*
        do while always execute once even if the condition is  false
        syntax ->
                do {
                    // block execute
                }
                while(condition)
         */

        int age = 22;

        do {
            System.out.println("User is not able to drive if he is below 18");
        }while (age <18);

        System.out.println("it run once even if condition is  false");
    }
}

package _03_Loops;

public class _04_DoWhileLoop
{
    public static void main(String[] args) {
        // do while loop is always execute even the condition is false

        int salary = 10000;
        float incr = 0;

        do{
            incr = salary * (20/100f);
        }while (salary >  20000);

        System.out.println("Original salary : " + salary);
        System.out.println("Salary increment : " + (salary + incr));
    }
}

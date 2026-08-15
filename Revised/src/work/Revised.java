package work;

import java.util.Scanner;

public class Revised
{
    public static void main(String[] args) {

//      System.out.println("Hello world");
        // decision making based on the perticular condition
        // we can consider the action if the age is greater that 18 user is eligible for vote
        // for that we have
        // if
        // if else
        // else if ladder
        // nested if else
   /*     int age = 22;
        if(age > 18)
        {
            System.out.println("you are elgible for vote");
        }else{
            System.out.println("you are not eligible for vote");
        }

        // we can check give grade as per marks using else if ladder
        int marks = 98;
        if(marks > 90 && marks<=100)
        {
            System.out.println("Grade A");
        }else if(marks > 80 && marks <=90)
        {
            System.out.println("Grade B");
        }else{
            System.out.println("Grade c");
        }

        // we also have nested if else
        // check the given number is divisible by 3 and 5 or not
        int num = 34;
        if(num % 3 == 0)
        {
            if(num % 5 == 0)
            {
                System.out.println("number is divisible by 3 and 5");
            }else{
                System.out.println("Number is divisible by 3 but not 5");
            }
        }else {
            System.out.println("Number is not divisible by 3 and 5");
        }
*/
        // for also to check on the condition we have switch case
      /*  int day = 2;
        switch (day)
        {
            case 1:
                System.out.println("sunday");
                break;

            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

                // default case executes when no case match
            default:
                System.out.println("no case match");
        }

        // we have also advanced form of switch case
        int month = 1;
        switch (month)
        {
            case 1 -> System.out.println("Janurary");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("march");
            default -> System.out.println("invalid case");
        }

        // for the condition we have also the shorter form of that
        String ans = (month == 1) ? "true" : "false";
        System.out.println(ans);

       */

        //we have two type of data type in java primitive data type and non primitive data type
        /*
        Primitive data type
        byte -> 1byte
        short -> 2byte
        int -> 4 byte
        float-> 4byte
        long -> 8 byte
        double-> 8byte

        in non primitive we habe class objects array linked list
         */

        // for the to store the smaller value in larger data type for that we have implicit and explicit type casting
    /*    byte a = 10;
        int x = a;
        System.out.println(x); // you can store the smaller data in larger one of implicit type casting

        double g = 9.8;
        float f = (float) g; //  in that while you storing the larger data in smaller one you have to explicit define the data type
        System.out.println(f); */

        // to perform the operation iterative time that time we can use loops
        // in loops we have
        // 1. for loop
        // 2. while loop
        // 3. do while loop

        /*
        for(initialise; condition ; updation)
        {
            execute block if the condition is true
        }
         */
    /*    for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop used when you do not know how many times you have to iterate
        // consider like the case is depend on the user input if used enter 00 it shows all sum
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int guess = sc.nextInt();
        while (guess != 5)
        {
            System.out.println("enter the number again :");
            guess = sc.nextInt();
        }

        // we also have do while loop
//        do while loop is always executes even the condition is false
        do{
            System.out.println("executes once");
        }while (guess != 5);
     */

        // for the variable we have
        // 1 local variable -> inside the block
        // 2 global variable - accessible all over the program
        // 3 static variable -> it use for the memory management
        // 4 instance variable -> it can be accessible when the object is created
    }
}

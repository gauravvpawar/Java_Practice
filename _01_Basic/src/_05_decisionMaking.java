
// check the given age is valid or not using if else condition

import java.util.*;
public class _05_decisionMaking
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the user age : ");
        age = sc.nextInt();
        if(age > 18)
        {
            System.out.println("User is eligible for driving");
        }else{
            System.out.println("User is not eligible for driving");
        }
    }
}

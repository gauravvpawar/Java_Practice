package _07_SearchingTechnique._01_LinearSearch.Questions;

import java.util.Scanner;

// check the target character present in array or not
public class _01_CheckTargetCharacter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();

        System.out.println("Enter the target character : ");
        char ch = sc.next().charAt(0);



        int idx = -1;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) == ch)
            {
                idx = i;
            }
        }

        System.out.println("Chacter present at idx : " + idx);
    }
}

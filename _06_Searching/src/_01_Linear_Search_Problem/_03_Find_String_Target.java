package _01_Linear_Search_Problem;

// check the given target character is present in given string if it is then find idx or not

import java.util.Scanner;

public class _03_Find_String_Target
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();

        System.out.println("Enter the searching character : ");
        char target = sc.next().charAt(0);

        int idx = -1;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) == target)
            {
                idx = i;
                break;
            }
        }

        System.out.println("Character present at  idx : " + idx);
    }
}

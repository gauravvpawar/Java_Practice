package _01_Linear_Search_Problem;

import java.util.Scanner;

// take the array of string and check the given target string is present in array or not
public class _06_String_Present
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size you want to store string in array : ");
        int num = sc.nextInt();

        String names[] = new String[num];

        System.out.println("Enter the string  : ");
        for(int i = 0;i<names.length;i++)
        {
            names[i] = sc.next();
        }

        System.out.println("Enter the searching string : ");
        String target = sc.next();
        int idx = -1;
        for(int i = 0 ;i<num;i++)
        {
            if(names[i].equals(target))
            {
                idx = i;
            }
        }

        System.out.println("Target is present at : " + idx);
    }

}

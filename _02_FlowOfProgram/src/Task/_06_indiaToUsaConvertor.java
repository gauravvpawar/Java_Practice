package Task;

import java.util.Scanner;

public class _06_indiaToUsaConvertor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the indian amount : ");
        int rs = sc.nextInt();

        System.out.println("Usd amount : " + rs/85.99);
    }
}

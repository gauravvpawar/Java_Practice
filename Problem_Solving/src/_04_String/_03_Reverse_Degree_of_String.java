package _04_String;

public class _03_Reverse_Degree_of_String
{
    public static void main(String[] args) {
        char ch = 'a';
//        System.out.println((int)ch);
        int a = ch;
//        System.out.println(a);
//        System.out.println(97+26);

        // store till = 123
        int store = 123;
        int value = store - ch;
//        System.out.println(value);

//        System.out.println(reverseDegree("abc"));
        System.out.println(reverseDegree("zaza"));
    }

    public static int reverseDegree(String s) {
        int store = 123;
        int sum = 0;
        int idx = 1;
        for(char ch : s.toCharArray())
        {
            sum += (store - ch) * idx;
            idx++;
        }

        return sum;
    }

}

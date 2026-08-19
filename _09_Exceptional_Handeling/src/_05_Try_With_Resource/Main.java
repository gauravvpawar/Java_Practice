package _05_Try_With_Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException {
        // in java 1.5 they introduce scanner class to take input from console
        // before that we have

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(in);

//        System.out.println("Enter name : ");
//        String name = br.readLine(); //  it throws exception
//        System.out.println("hello " + name);

//        br.close();
//        in.close(); //  in that we have to close resource manually

        // instead that we have try with resource it close automatically
        try(BufferedReader bufread = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter number : ");
            int num = Integer.parseInt(bufread.readLine());
            System.out.println(num);
        }
        catch (Exception e)
        {
            System.out.println("Exception occur");
        }
    }
}

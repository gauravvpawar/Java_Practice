package _03_Stream_Api;

import java.util.ArrayList;

public class _01_Stream_Create
{
    public static void main(String[] args) {
        // Stream provide set of operation you can perform it on collection object
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(9);
        al.add(5);
        al.add(45);

        System.out.println(al);

        // by the normal java code
//        if you want to print the sum of even element
        int sum = 0;
        for(int e : al) {
            if (e % 2 == 0) {
                e = e * 2;
                sum += e;
            }
        };

        System.out.println("sum : " + sum);

        // in shorter version
        int total = al.stream().filter(e -> e % 2== 0)
                .map(e -> e * 2)
                .reduce(0 , (c , e) -> c + e);

        System.out.println("total : " + total);
    }
}

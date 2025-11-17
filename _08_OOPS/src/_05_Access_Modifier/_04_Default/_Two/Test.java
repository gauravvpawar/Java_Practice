package _05_Access_Modifier._04_Default._Two;

// default does not accessible outside package

import _05_Access_Modifier._04_Default.Earth;

public class Test extends Earth
{
    public static void main(String[] args) {
        Earth e1 = new Earth();
//        e1.execute(); // you cant access it

        Test t1 = new Test();
//        t1.execute(); you cant access in another package subclass also
    }
}

package _01_Enum._02_Enum_Variable_method;

enum Subject
{
    MATH, CHE, BIO;

    private int marks = 0;

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}

public class _01_Demo
{
    public static void main(String[] args) {
        /*
        In enum have constructor and method also
         */

        Subject.MATH.setMarks(92);
        Subject.CHE.setMarks(80);
        Subject.BIO.setMarks(85);


        System.out.println(Subject.MATH.getMarks());
        System.out.println(Subject.CHE.getMarks());
        System.out.println(Subject.BIO.getMarks());
    }
}

package _02_Constructor;


class Company
{
    int empId;
    String empName;
}

class Pen
{
    int price;
    String color;

    Pen()
    {
        System.out.println("you called");
    }

    public void prop()
    {
        System.out.println(price + " " + color);
    }
}

public class _02_Default_Constructor
{
    public static void main(String[] args) {
        /*
         default constructor ->
            default in the class when you create the object
            it always called when you create the  object
            when you do not pass any parameter inside the constructor it called default constructor
         */

        Pen p1 = new Pen();

        Pen p2 = new Pen();

        // even if the default parameter is there when you create the object
        Company emp1 = new Company();
        emp1.empId = 1212;
        emp1.empName = "rakesh";
        System.out.println(emp1.empId);
        System.out.println(emp1.empName);

    }
}

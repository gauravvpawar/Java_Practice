package Questions;

public class _22_Rotate_String
{
    public static void main(String[] args) {
//        Input: s = "abcde", goal = "cdeab"
//        Output: true
        System.out.println(rotateString("abcde" , "cdeab"));
    }

    public static  boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        {
            return false;
        }

        String con = s+s; // index of just check the give target string present in given string or not
        if(con.indexOf(goal) != -1)
        {
            return true;
        }



        return false;
    }
}

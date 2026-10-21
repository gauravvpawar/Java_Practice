package _07_Math;

public class _10_Automorphic_Problem {
    public static void main(String[] args) {
        _10_Automorphic_Problem obj1 = new _10_Automorphic_Problem();
        System.out.println(obj1.isAutomorphic(76));
    }

    public  String isAutomorphic(int n) {
        // code here
        int square = n * n;
        int place = 1;
        int countDigit =  countDigit(n);
        int ans = 0;
        while(countDigit > 0)
        {
            int rem = square % 10;
            ans = ans + rem * place;

            place *= 10;
            square /= 10;
            countDigit--;
        }

        return n == ans ? "Automorphic" : "Not Automorphic";
    }

    public int countDigit(int num)
    {
        int count = 0;
        while(num > 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }
}

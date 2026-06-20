package Questions;

public class _20_Find_Min_Moves
{
    public static void main(String[] args) {
        System.out.println(minMoves(5 , 0));
    }

    public static int minMoves(int target, int maxDoubles) {
        int moves = 0;

        if(maxDoubles != target)
        {
            if(maxDoubles == 0)
            {
                maxDoubles = maxDoubles * 2;
            }


        }
        return moves;
    }
}

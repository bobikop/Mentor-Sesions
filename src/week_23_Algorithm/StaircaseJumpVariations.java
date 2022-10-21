package week_23_Algorithm;

public class StaircaseJumpVariations {

    public static void main(String[] args) {


        System.out.println(stairsJumps(4));

        System.out.println("-----------------------------------");

        System.out.println(stairsJumps3(5));

        System.out.println(stairsJumps4(7));

    }

    /*
    * TASK;
    * Simba the Cat has a number of staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a
time. Given the respective heights for each of the staircases in his house, find and print the number
of ways he can climb each staircase.
In other words, find the possible variation counts of climbing a staircase of which length is your
input.
*
* Example 1
Input: 3
Output: 4
*
* Example 2
Input: 4
Output: 7

    * */


    // SOLUTION 1 - working
    public static int stairsJumps(int sn) {
        if (sn == 0)
            return 1;
        else if (sn < 0) return 0;
        else
            return stairsJumps(sn - 3) + stairsJumps(sn - 2) + stairsJumps(sn - 1);

    }



    // SOLUTION 2

    public static int stairsJumps3(int sn) {

        // countStairs(n) = countStairs(n-1) + countStairs(n-2) + countStairs(n-3)
        int count = 0;

        if (sn==1) return 1;
        if (sn==2) return 2;
        if (sn==3) return 4;
        if (sn<=0) return 0;

        count = stairsJumps3(sn - 3) + stairsJumps3(sn - 2) + stairsJumps3(sn - 1);

        return count;
    }

    // SOLUTION 3

    public static int stairsJumps4(int sn) {

        // countStairs(n) = countStairs(n-1) + countStairs(n-2) + countStairs(n-3)
        int count = 0;

        if (sn==1) return 1;
        if (sn==2) return 2;
        if (sn<=0) return 0;

        count = stairsJumps3(sn - 3) + stairsJumps3(sn - 2) + stairsJumps3(sn - 1);

        return count;
    }

}

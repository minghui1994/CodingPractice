import java.util.*;

/**
 * Given a positive integer n, sum all of its digits to get a new number. Repeat
 * this operation until the new number is less than 10 and return it.
 * 
 * n = 8835
 * ouput: 6
 * 
 * 8 + 8 + 3 + 5 = 24
 * 2 + 4 = 6
 */

public class RepeatedAddition {
    public static void main(String[] args)
    {
        int num = 8835;
        System.out.println(solve(num));
    }

    public static int solve(int n) {

        int newNum = 0;

        while (n >= 10) {
            newNum = 0;

            while (n != 0) {
                newNum += (n % 10);
                n /= 10;
            }
            n = newNum;
        }

        return n;
    }

}

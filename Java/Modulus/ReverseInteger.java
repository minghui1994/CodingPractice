/**
 * Given an integer, reverse the integer.
 * 2543 -> 3452
 */
public class ReverseInteger {
    public static void main(String[] args)
    {
        int num = 1000;
        solve(num);
    }

    public static void solve(int num)
    {
        int multiplier = 1;
        int result = 0;
        int temp = num;

        /** Num of digits - 1 will give us the num of zeroes */
        int noOfZeroes = findNumDigits(num) - 1;

        for (int i = 0; i < noOfZeroes; ++i)
        {
            multiplier *= 10;
        }

        while (num != 0) {
            int currNum = num % 10;
            result += (currNum * multiplier);
            multiplier /= 10;
            num /= 10;
        }

        System.out.println("Reversed " + temp + ": " + result);
    }
    
    public static int findNumDigits(int num)
    {
        int numOfDigits = 0;
        while(num != 0)
        {
            num /= 10;
            ++numOfDigits;
        }
        return numOfDigits;
    }
}
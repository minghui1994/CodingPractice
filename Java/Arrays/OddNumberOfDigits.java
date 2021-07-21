/**
 * Given a list of positive integers nums, return the number of integers that
 * have odd number of digits.
 */
public class OddNumberOfDigits {
    public static void main(String[] args) {
        int arr[] = { 1, 800, 2, 10, 3 };
        System.out.println(solve(arr));
    }

    public static int solve(int[] nums) {

        int index = 0;
        int count = 0;
        int numDigits = 0;

        while (index < nums.length) {
            numDigits = 0;
            while (nums[index] != 0) {
                ++numDigits;
                nums[index] /= 10;
            }

            if (numDigits % 2 != 0) {
                ++count;
            }
            ++index;
        }

        return count;
    }
}
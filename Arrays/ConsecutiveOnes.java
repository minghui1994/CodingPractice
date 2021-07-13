package Arrays;

/**
 * You are given a list of integers nums which contains at least one 1. Return
 * whether all the 1s appear consecutively.
 */
public class ConsecutiveOnes {
    public static void main(String[] args)
    {
        int[] nums = { 0, 1, 1, 1, 2, 3 };
        int[] nums2 = { 1, 1, 0, 1, 1 }; // false
        System.out.println(solve(nums));
    }

    public static boolean solve(int[] nums) {

        /** First and second sequence of 1s */
        boolean firstSeq = true;
        boolean secSeq = false;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1 && firstSeq) {
                firstSeq = false;
                secSeq = true;

                /** Iterate through all the ones */
                while (nums[i] == 1) {
                    ++i;
                    if (i >= nums.length) {
                        return true;
                    }
                }
                /** have to account for 1 additional */
                --i;
            } else if (nums[i] == 1 && secSeq) {
                return false;
            }
        }

        return true;
    }
}

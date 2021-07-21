/**
 * Given a list of integers nums sorted in ascending order and an integer k,
 * return whether any two elements from the list add up to k. You may not use
 * the same element twice.
 * 
 * Note: Numbers can be negative or 0.
 */

public class SumOfTwoNumInSortedList {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 8 };
        int k = 6;
        System.out.println(solve(nums));
    }

    public boolean solve(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}

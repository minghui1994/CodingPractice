import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Given a list of integers nums, find all duplicate numbers and delete their
 * last occurrences.
 */
public class RemoveLastDuplicateEntries {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 1, 3, 5 };
        int[] result = solve(arr);

        printArr(result);
    }

    public static int[] solve(int[] nums) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            if (table.containsKey(nums[i])) {
                table.put(nums[i], table.get(nums[i]) + 1);
            } else {
                table.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; ++i) {
            if (table.get(nums[i]) == -1) {
                continue;
            }

            arr.add(nums[i]);

            // when left 2, set it to -1 after adding to arr, means got last
            // one left
            if (table.get(nums[i]) == 2) {
                table.put(nums[i], -1);
            } else {
                table.put(nums[i], table.get(nums[i]) - 1);
            }
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); ++i) {
            result[i] = arr.get(i);
        }

        return result;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; ++i) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "]");
            }
        }
    }
}
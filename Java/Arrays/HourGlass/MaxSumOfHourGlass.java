import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MaxSumOfHourGlass {

    public static final int LENGTH = 6;
    public static final int END_INDEX = LENGTH - 1;

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>(LENGTH);
        populateList(arr);
        System.out.println(maxHourGlassSum(arr));
    }

    public static int maxHourGlassSum(List<List<Integer>> arr) {
        // Write your code here

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < LENGTH; ++i) {
            for (int j = 0; j < LENGTH; ++j) {
                int hourGlassSum = 0;

                // Conditions for valid hour glass
                if (j + 1 > END_INDEX || j + 2 > END_INDEX || i + 1 > END_INDEX || i + 2 > END_INDEX) {
                    continue;
                }
                hourGlassSum += arr.get(i).get(j);
                hourGlassSum += arr.get(i).get(j + 1);
                hourGlassSum += arr.get(i).get(j + 2);
                hourGlassSum += arr.get(i + 1).get(j + 1);
                hourGlassSum += arr.get(i + 2).get(j + 1);
                hourGlassSum += arr.get(i + 2).get(j);
                hourGlassSum += arr.get(i + 2).get(j + 2);

                if (hourGlassSum > max) {
                    max = hourGlassSum;
                }
            }
        }
        return max;
    }

    public static void populateList(List<List<Integer>> arr) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < LENGTH; ++i)
        {
            arr.add(new ArrayList<Integer>(LENGTH));
            for(int j = 0; j < LENGTH; ++j)
            {
                arr.get(i).add(j, sc.nextInt());
            }
        }

        sc.close();
    }
}
